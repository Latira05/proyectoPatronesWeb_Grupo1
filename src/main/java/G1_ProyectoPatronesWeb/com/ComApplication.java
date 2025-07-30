package G1_ProyectoPatronesWeb.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {
    "G1_ProyectoPatronesWeb.com",
    "com.controller",
    "com.service",
    "com.serviceIMPL",
    "com.dao"
})
@EntityScan(basePackages = "com.domain")
@EnableJpaRepositories(basePackages = "com.dao")
public class ComApplication {
    public static void main(String[] args) {
        SpringApplication.run(ComApplication.class, args);
    }
}
