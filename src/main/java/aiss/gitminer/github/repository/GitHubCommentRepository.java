package aiss.gitminer.github.repository;

import aiss.gitminer.authentication.AuthenticationRestTemplate;
import aiss.gitminer.github.model.GitHubComment;
import org.springframework.stereotype.Repository;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static aiss.gitminer.github.GitHubMinerApplication.BASE_DIR;

@Repository
public class GitHubCommentRepository {

    private final AuthenticationRestTemplate restTemplate;

    public GitHubCommentRepository(AuthenticationRestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<GitHubComment> fetchIssueComments(String owner, String repo, int issueNumber, int page, String token) {
        String url = UriComponentsBuilder.fromUriString(BASE_DIR + "/" + owner + "/" + repo + "/issues/" + issueNumber + "/comments")
                .queryParam("page", page)
                .toUriString();

        GitHubComment[] response = Objects.requireNonNull(restTemplate.getForObject(url, GitHubComment[].class, token));
        return Arrays.asList(response);
    }
}
