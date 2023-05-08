package aiss.gitminer.github.service;

import aiss.gitminer.github.model.GitHubComment;
import aiss.gitminer.github.repository.GitHubCommentRepository;
import aiss.gitminer.model.Comment;
import aiss.gitminer.pagination.RestPaginationHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired private GitHubCommentRepository commentRepository;

    public List<Comment> fetchIssueComments(String owner, String repo, int issueNumber, int maxPages, String token) {
        return RestPaginationHelper.unwrap(
                page -> this.commentRepository.fetchIssueComments(owner, repo, issueNumber, page, token),
                maxPages
        ).stream().map(GitHubComment::toComment).toList();
    }
}
