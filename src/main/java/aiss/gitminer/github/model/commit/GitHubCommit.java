package aiss.gitminer.github.model.commit;

import aiss.gitminer.model.Commit;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("jsonschema2pojo")
public class GitHubCommit {

    @JsonProperty("html_url")
    private String url;

    @JsonProperty("commit")
    private GitHubCommitDetails details;

    @JsonProperty("commit")
    public GitHubCommitDetails getDetails() {
        return details;
    }

    @JsonProperty("commit")
    public void setDetails(GitHubCommitDetails details) {
        this.details = details;
    }

    public Commit toCommit() {
        return new Commit(UUID.randomUUID().toString(), this.details.getMessage(), this.details.getMessage(),
                this.details.getAuthor().getName(), this.details.getAuthor().getEmail(), this.details.getAuthor().getDate(),
                this.details.getCommitter().getName(), this.details.getCommitter().getEmail(), this.details.getCommitter().getDate(),
                this.url);
    }

    @Override
    public String toString() {
        return "GitHubCommitWrapper{" +
               "commit=" + details +
               '}';
    }
}
