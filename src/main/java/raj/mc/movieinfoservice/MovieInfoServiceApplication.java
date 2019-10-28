package raj.mc.movieinfoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@Configuration
@ComponentScan({ "movieResources", "model" })
public class MovieInfoServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieInfoServiceApplication.class, args);
    }

}
