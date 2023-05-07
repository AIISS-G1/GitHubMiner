package aiss.gitminer.github.model.commit;

import aiss.gitminer.model.Commit;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("jsonschema2pojo")
public class GitHubCommit {

    @JsonProperty("url")
    private String url;

    @JsonProperty("author")
    private CommitUser author;

    @JsonProperty("committer")
    private CommitUser committer;

    @JsonProperty("message")
    private String message;

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    public Commit toCommit() {
        return new Commit(null, this.message, this.message,
                this.author.getName(), this.author.getEmail(), this.author.getDate(),
                this.committer.getName(), this.committer.getEmail(), this.committer.getDate(),
                this.url);
    }

    @Override
    public String toString() {
        return "GitHubCommit{" +
               "url='" + url + '\'' +
               ", author=" + author +
               ", committer=" + committer +
               ", message='" + message + '\'' +
               '}';
    }
}
