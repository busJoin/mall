package com.chang.mall.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @create 2020-02-25 8:12
 * Swagger2API文档的配置
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("mall后台系统")
                .description("mall后台模块")
                .contact("chang")
                .version("1.0")
                .build();
    }

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.chang.mall.controller"))
                .paths(PathSelectors.any())
                .build();
//                .securitySchemes(securitySchemes())
//                .securityContexts(securityContexts());
    }
}
