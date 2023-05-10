package aiss.gitminer.github.service;

import aiss.gitminer.github.model.issue.GitHubIssue;
import aiss.gitminer.github.repository.GitHubIssueRepository;
import aiss.gitminer.model.Issue;
import aiss.gitminer.pagination.RestPaginationHelper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@Service
public class IssueService {

    private final GitHubIssueRepository issueRepository;
    private final CommentService commentService;

    public IssueService(GitHubIssueRepository issueRepository, CommentService commentService) {
        this.issueRepository = issueRepository;
        this.commentService = commentService;
    }

    public List<Issue> fetchProjectIssues(String owner, String repo, int maxPages, int since, String token) {
        List<GitHubIssue> issues = RestPaginationHelper.unwrap(
                page -> this.issueRepository.fetchProjectIssues(owner, repo, page, LocalDate.now().minus(Period.ofDays(since)), token),
                maxPages
        );

        return issues.stream()
                .peek(issue -> issue.setComments(this.commentService.fetchIssueComments(owner, repo, issue.getNumber(), 1, token)))
                .map(GitHubIssue::toIssue)
                .toList();
    }
}
