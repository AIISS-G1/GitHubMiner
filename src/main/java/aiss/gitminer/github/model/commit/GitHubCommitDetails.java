package aiss.gitminer.github.model.commit;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("jsonschema2pojo")
public class GitHubCommitDetails {

    @JsonProperty("author")
    private CommitUser author;

    @JsonProperty("committer")
    private CommitUser committer;

    @JsonProperty("message")
    private String message;

    public GitHubCommitDetails() {
        // Constructor for Jackson
    }

    public GitHubCommitDetails(CommitUser author, CommitUser committer, String message) {
        this.author = author;
        this.committer = committer;
        this.message = message;
    }

    @JsonProperty("author")
    public CommitUser getAuthor() {
        return author;
    }

    @JsonProperty("author")
    public void setAuthor(CommitUser author) {
        this.author = author;
    }

    @JsonProperty("committer")
    public CommitUser getCommitter() {
        return committer;
    }

    @JsonProperty("committer")
    public void setCommitter(CommitUser committer) {
        this.committer = committer;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "GitHubCommitDetails{" +
               "author=" + author +
               ", committer=" + committer +
               ", message='" + message + '\'' +
               '}';
    }
}
