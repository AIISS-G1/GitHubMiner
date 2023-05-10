package aiss.gitminer.github;

import aiss.gitminer.exception.AuthenticationException;
import aiss.gitminer.github.service.ProjectService;
import aiss.gitminer.model.Project;
import aiss.gitminer.service.GitMinerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class GitHubController {

    private final GitMinerService gitMinerService;
    private final ProjectService projectService;

    public GitHubController(GitMinerService gitMinerService, ProjectService projectService) {
        this.gitMinerService = gitMinerService;
        this.projectService = projectService;
    }

    @GetMapping("/{owner}/{repo}")
    @ResponseStatus(HttpStatus.OK)
    public Project get(@RequestHeader(value = HttpHeaders.AUTHORIZATION, required = false) String authorization,
                       @PathVariable String owner,
                       @PathVariable String repo,
                       @RequestParam(defaultValue = "2") int sinceCommits,
                       @RequestParam(defaultValue = "20") int sinceIssues,
                       @RequestParam(defaultValue = "2") int maxPages) {
        String token = Optional.ofNullable(authorization)
                .map(s -> s.replace("Bearer ", ""))
                .orElseThrow(() -> new AuthenticationException(HttpStatus.UNAUTHORIZED));

        return this.projectService.findById(owner, repo, sinceCommits, sinceIssues, maxPages, token);
    }

    @PostMapping("/{owner}/{repo}")
    @ResponseStatus(HttpStatus.CREATED)
    public Project create(@RequestHeader(HttpHeaders.AUTHORIZATION) String authorization,
                          @PathVariable String owner,
                          @PathVariable String repo,
                          @RequestParam(defaultValue = "2") int sinceCommits,
                          @RequestParam(defaultValue = "20") int sinceIssues,
                          @RequestParam(defaultValue = "2") int maxPages) {
        Project project = this.get(authorization, owner, repo, sinceCommits, sinceIssues, maxPages);
        this.gitMinerService.uploadProject(project);
        return project;
    }
}
