package com.example.swagger.controller;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("My API Title")
                        .version("1.0")
                        .description("This is a sample API description")
                        .termsOfService("http://terms.of.service.url")
                        .contact(new io.swagger.v3.oas.models.info.Contact()
                                .name("API Support")
                                .url("http://support.url")
                                .email("support@example.com"))
                        .license(new io.swagger.v3.oas.models.info.License()
                                .name("API License")
                                .url("http://license.url"))
                );
    }
}