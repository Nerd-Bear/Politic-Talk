package com.java_team_project.politictalk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.java_team_project.politictalk.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo(){
        return new ApiInfo(
                "PoliticTalk API",
                "자바 프로젝트 PoliticTalk API",
                "Prototype",
                "https://github.com/Nerd-Bear/Politic-Talk",
                new Contact("Nerd-Bear", "https://github.com/Nerd-Bear/Politic-Talk", "python@istruly.sexy"),
                "MIT",
                "https://opensource.org/licenses/MIT");
    }
}
