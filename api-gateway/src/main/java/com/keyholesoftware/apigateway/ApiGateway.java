package com.keyholesoftware.apigateway;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Jaime Niswonger
 */

@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableZuulProxy
public class ApiGateway {
	
    public static void main(String[] args) {
        new SpringApplicationBuilder(ApiGateway.class).web(true).run(args);
    }
}
