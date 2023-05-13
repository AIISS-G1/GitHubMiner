package aiss.gitminer.github.model.issue;

import aiss.gitminer.github.model.GitHubUser;
import aiss.gitminer.model.Comment;
import aiss.gitminer.model.Issue;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("jsonschema2pojo")
public class GitHubIssue {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("number")
    private Integer number;

    @JsonProperty("title")
    private String title;

    @JsonProperty("body")
    private String body;

    @JsonProperty("state")
    private String state;

    @JsonProperty("closed_at")
    private String closedAt;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("updated_at")
    private String updatedAt;

    @JsonProperty("labels")
    private List<IssueLabel> labels;

    @JsonProperty("user")
    private GitHubUser user;

    @JsonProperty("assignee")
    private GitHubUser assignee;

    @JsonProperty("html_url")
    private String htmlUrl;

    @JsonIgnore
    private List<Comment> comments;

    public GitHubIssue() {
        // Constructor for Jackson
    }

    public GitHubIssue(Integer id, Integer number, String title, String body, String state, String closedAt,
                       String createdAt, String updatedAt, List<IssueLabel> labels, GitHubUser user,
                       GitHubUser assignee, String htmlUrl, List<Comment> comments) {
        this.id = id;
        this.number = number;
        this.title = title;
        this.body = body;
        this.state = state;
        this.closedAt = closedAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.labels = labels;
        this.user = user;
        this.assignee = assignee;
        this.htmlUrl = htmlUrl;
        this.comments = comments;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("number")
    public Integer getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    @JsonProperty("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
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

    @JsonProperty("labels")
    public List<IssueLabel> getLabels() {
        return labels;
    }

    @JsonProperty("labels")
    public void setLabels(List<IssueLabel> labels) {
        this.labels = labels;
    }

    @JsonProperty("assignee")
    public GitHubUser getAssignee() {
        return assignee;
    }

    @JsonIgnore
    public Optional<GitHubUser> getAsigneeOptional() {
        return Optional.ofNullable(this.getAssignee());
    }

    @JsonProperty("assignee")
    public void setAssignee(GitHubUser assignee) {
        this.assignee = assignee;
    }

    @JsonProperty("closed_at")
    public String getClosedAt() {
        return closedAt;
    }

    @JsonProperty("closed_at")
    public void setClosedAt(String closedAt) {
        this.closedAt = closedAt;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Issue toIssue() {
        return new Issue(UUID.randomUUID().toString(), this.id.toString(), this.title, this.body, this.state, this.createdAt, this.updatedAt,
                this.closedAt, this.labels.stream().map(IssueLabel::getName).toList(), this.user.toUser(),
                this.getAsigneeOptional().map(GitHubUser::toUser).orElse(null),
                null, null, this.htmlUrl, this.comments);
    }

    @Override
    public String toString() {
        return "GitHubIssue{" +
               "id=" + id +
               ", title='" + title + '\'' +
               ", body='" + body + '\'' +
               ", state='" + state + '\'' +
               ", closedAt='" + closedAt + '\'' +
               ", createdAt='" + createdAt + '\'' +
               ", updatedAt='" + updatedAt + '\'' +
               ", labels=" + labels +
               ", user=" + user +
               ", assignee=" + assignee +
               ", htmlUrl='" + htmlUrl + '\'' +
               '}';
    }
}
