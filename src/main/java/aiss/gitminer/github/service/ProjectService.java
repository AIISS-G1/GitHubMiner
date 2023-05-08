package aiss.gitminer.github.service;

import aiss.gitminer.github.model.GitHubRepo;
import aiss.gitminer.github.repository.GitHubRepoRepository;
import aiss.gitminer.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired private GitHubRepoRepository repoRepository;

    @Autowired private CommitService commitService;
    @Autowired private IssueService issueService;

    public Project findById(String owner, String repoName, int sinceCommits, int sinceIssues, int maxPages, String token) {
        GitHubRepo repo = this.repoRepository.findById(owner, repoName, token);

        repo.setCommits(this.commitService.fetchProjectCommits(owner, repoName, maxPages, sinceCommits, token));
        repo.setIssues(this.issueService.fetchProjectIssues(owner, repoName, maxPages, sinceIssues, token));

        return repo.toProject();
    }
}
