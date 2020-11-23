/*
 * Copyright (c) 2020. Iurii Golubnichenko aka Ghost Rider
 */

package corp.siendev.com.javaworld.config;

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
public class SwaggerConfiguration {

    @Bean
    public Docket swaggerConfig() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.ant("/api/*"))
                .apis(RequestHandlerSelectors.basePackage("corp.siendev.com.javaworld"))
                .build()
                .apiInfo(apiDetailInfo());
    }

    private ApiInfo apiDetailInfo() {
        return new ApiInfo(
                "Java World API",
                "Full API documentation for Java World web application",
                "0.1",
                "Open Source App",
                new Contact("Iurii Golubnichenko", "", "iurii.golubnichenko@gmail.com"),
                "MIT License",
                "",
                Collections.emptyList()
        );
    }
}
