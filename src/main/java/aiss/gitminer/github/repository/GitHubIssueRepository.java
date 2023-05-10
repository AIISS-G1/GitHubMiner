package aiss.gitminer.github.repository;

import aiss.gitminer.authentication.AuthenticationRestTemplate;
import aiss.gitminer.github.model.issue.GitHubIssue;
import org.springframework.stereotype.Repository;
import org.springframework.web.util.UriComponentsBuilder;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import static aiss.gitminer.github.GitHubMinerApplication.BASE_DIR;

@Repository
public class GitHubIssueRepository {

    private final AuthenticationRestTemplate restTemplate;

    public GitHubIssueRepository(AuthenticationRestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<GitHubIssue> fetchProjectIssues(String owner, String repo, int page, LocalDate since, String token) {
        String url = UriComponentsBuilder.fromUriString(BASE_DIR + "/" + owner + "/" + repo + "/issues")
                .queryParam("page", page)
                .queryParamIfPresent("since", Optional.ofNullable(since)
                        .map(date -> date.format(DateTimeFormatter.ISO_DATE)))
                .toUriString();

        GitHubIssue[] response = Objects.requireNonNull(this.restTemplate.getForObject(url, GitHubIssue[].class, token));
        return Arrays.asList(response);
    }
}
