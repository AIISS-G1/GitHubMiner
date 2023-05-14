package aiss.gitminer.github.model;

import aiss.gitminer.model.Comment;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;
import java.time.Instant;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("jsonschema2pojo")
public class GitHubComment {

    @JsonProperty("body")
    private String body;

    @JsonProperty("user")
    private GitHubUser user;

    @JsonProperty("created_at")
    private Instant createdAt;

    @JsonProperty("updated_at")
    private Instant updatedAt;

    public GitHubComment() {
        // Constructor for Jackson
    }

    public GitHubComment(String body, GitHubUser user, Instant createdAt, Instant updatedAt) {
        this.body = body;
        this.user = user;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    @JsonProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    @JsonProperty("user")
    public GitHubUser getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(GitHubUser user) {
        this.user = user;
    }

    @JsonProperty("created_at")
    public Instant getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updated_at")
    public Instant getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Comment toComment() {
        return new Comment(UUID.randomUUID().toString(), this.body, this.user.toUser(), this.createdAt, this.updatedAt);
    }

    @Override
    public String toString() {
        return "GitHubComment{" +
               "body='" + body + '\'' +
               ", user=" + user +
               ", createdAt='" + createdAt + '\'' +
               ", updatedAt='" + updatedAt + '\'' +
               '}';
    }
}
