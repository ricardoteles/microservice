package com.ricardo.mscloudgateway.configs;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder){
        return builder
                .routes()
                .route( r -> r.path("/clientes/**").uri("lb://msclientes") )
                .route( r -> r.path("/cartoes/**").uri("lb://mscartoes") )
                .route( r -> r.path("/avaliacoes-credito/**").uri("lb://msavaliadorcredito") )
                .build();
    }
}
