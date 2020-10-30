package com.pplove.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2config {

    @Value(value = "${spring.swagger2.enabled}")
    private Boolean swEnabled;

    @Bean
    public Docket createrestAPI(){
        return new Docket(DocumentationType.SWAGGER_2)

                .apiInfo(apiInfo())
                .enable(swEnabled)
                .select().apis(RequestHandlerSelectors.basePackage("com.pplove.hzwebapi"))
                .build();


    }

    @Bean
    public ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("含之智农接口文档")
                .description("文档的接口说明")
//                .termsOfServiceUrl("baidu.com")
                .version("2.0.1")
                .build();
    }
}
