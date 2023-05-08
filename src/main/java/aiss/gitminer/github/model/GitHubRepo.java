package aiss.gitminer.github.model;

import aiss.gitminer.model.Project;
import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("jsonschema2pojo")
public class GitHubRepo {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

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

    public Project toProject() {
        return new Project(this.id.toString(), this.name, this.htmlUrl, null, null);
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
