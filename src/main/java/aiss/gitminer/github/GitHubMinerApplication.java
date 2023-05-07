package aiss.gitminer.github;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan("aiss.gitminer") // scan base project too
public class GitHubMinerApplication {

    public static final String BASE_DIR = "https://api.github.com/repos";

    public static void main(String[] args) {
        SpringApplication.run(GitHubMinerApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }
}
