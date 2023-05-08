package aiss.gitminer.github.repository;

import aiss.gitminer.authentication.AuthenticationRestTemplate;
import aiss.gitminer.github.model.GitHubRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static aiss.gitminer.github.GitHubMinerApplication.BASE_DIR;

@Repository
public class GitHubRepoRepository {

    @Autowired private AuthenticationRestTemplate restTemplate;

    public GitHubRepo findById(String owner, String repo, String token) {
        return this.restTemplate.getForObject(BASE_DIR + "/" + owner + "/" + repo, GitHubRepo.class, token);
    }
}
