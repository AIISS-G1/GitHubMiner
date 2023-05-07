package aiss.gitminer.github.model.commit;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("jsonschema2pojo")
public class GitHubCommitWrapper {

    @JsonProperty("commit")
    private GitHubCommit commit;

    @JsonProperty("commit")
    public GitHubCommit getCommit() {
        return commit;
    }

    @JsonProperty("commit")
    public void setCommit(GitHubCommit commit) {
        this.commit = commit;
    }

    @Override
    public String toString() {
        return "GitHubCommitWrapper{" +
               "commit=" + commit +
               '}';
    }
}
