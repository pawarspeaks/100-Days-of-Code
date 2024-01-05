import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class SpringBootRestAPI {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, welcome to the Spring Boot RESTful API!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestAPI.class, args);
    }
}
