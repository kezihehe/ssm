package com.lisk.framework.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/*
 * Restful API ����·��:
 * http://IP:port/{context-path}/swagger-ui.html
 * eg:http://localhost:8080/jd-config-web/swagger-ui.html
 */
@EnableWebMvc
@EnableSwagger2
@ComponentScan(basePackages = {"com.lisk.**.controller"})
@Configuration
public class RestApiConfig extends WebMvcConfigurationSupport {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.lisk.framework.demo.controlle"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("����Swagger2����")
                .termsOfServiceUrl("http://blog.csdn.net/he90227")
                .contact("kezihehe")
                .version("1.0")
                .build();
    }
}
