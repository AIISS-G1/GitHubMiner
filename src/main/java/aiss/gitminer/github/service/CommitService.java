package aiss.gitminer.github.service;

import aiss.gitminer.github.model.commit.GitHubCommit;
import aiss.gitminer.github.repository.GitHubCommitRepository;
import aiss.gitminer.model.Commit;
import aiss.gitminer.pagination.RestPaginationHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@Service
public class CommitService {

    @Autowired private GitHubCommitRepository commitRepository;

    public List<Commit> fetchProjectCommits(String owner, String repo, int maxPages, int since, String token) {
        return RestPaginationHelper.unwrap(
                page -> this.commitRepository.fetchProjectCommits(owner, repo, page,
                        LocalDate.now().minus(Period.ofDays(since)), token),
                maxPages
        ).stream().map(GitHubCommit::toCommit).toList();
    }
}
