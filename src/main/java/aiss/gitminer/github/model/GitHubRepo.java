package aiss.gitminer.github.model;

import aiss.gitminer.model.Commit;
import aiss.gitminer.model.Issue;
import aiss.gitminer.model.Project;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("jsonschema2pojo")
public class GitHubRepo {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("html_url")
    private String htmlUrl;

    @JsonIgnore
    private List<Commit> commits;

    @JsonIgnore
    private List<Issue> issues;

    public GitHubRepo(Integer id, String name, String htmlUrl, List<Commit> commits, List<Issue> issues) {
        this.id = id;
        this.name = name;
        this.htmlUrl = htmlUrl;
        this.commits = commits;
        this.issues = issues;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    @JsonProperty("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public List<Commit> getCommits() {
        return commits;
    }

    public void setCommits(List<Commit> commits) {
        this.commits = commits;
    }

    public List<Issue> getIssues() {
        return issues;
    }

    public void setIssues(List<Issue> issues) {
        this.issues = issues;
    }

    public Project toProject() {
        return new Project(this.id.toString(), this.name, this.htmlUrl, this.commits, this.issues);
    }

    @Override
    public String toString() {
        return "GitHubRepo{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", htmlUrl='" + htmlUrl + '\'' +
               '}';
    }
}
