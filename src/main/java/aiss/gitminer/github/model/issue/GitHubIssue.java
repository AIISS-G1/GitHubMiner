package aiss.gitminer.github.model.issue;

import aiss.gitminer.github.model.GitHubUser;
import aiss.gitminer.model.Issue;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("jsonschema2pojo")
public class GitHubIssue {

    @JsonProperty("id")
    private Integer id;

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

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
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

    public Issue toIssue() {
        return new Issue(null, this.id.toString(), this.title, this.body, this.state, this.createdAt, this.updatedAt,
                this.closedAt, this.labels.stream().map(IssueLabel::getName).toList(), this.user.toUser(),
                this.assignee.toUser(), null, null, this.htmlUrl, null);
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