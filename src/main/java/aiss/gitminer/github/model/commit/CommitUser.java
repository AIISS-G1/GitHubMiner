package aiss.gitminer.github.model.commit;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.Generated;
import java.time.Instant;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("jsonschema2pojo")
public class CommitUser {

    @JsonProperty("name")
    private String name;

    @JsonProperty("email")
    private String email;

    @JsonProperty("date")
    private Instant date;

    public CommitUser() {
        // Constructor for Jackson
    }

    public CommitUser(String name, String email, Instant date) {
        this.name = name;
        this.email = email;
        this.date = date;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("date")
    public Instant getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(Instant date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "CommitUser{" +
               "name='" + name + '\'' +
               ", email='" + email + '\'' +
               ", date='" + date + '\'' +
               '}';
    }
}
