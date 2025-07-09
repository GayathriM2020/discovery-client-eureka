package com.example.discovery_client_eureka.configuration;


import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public OpenAPI apiInfo() {
        return new OpenAPI()
                .info(new Info()
                        .title("Swagger Demo API")
                        .version("1.0")
                        .description("This is a sample Spring Boot project with Swagger UI"));
    }
}
