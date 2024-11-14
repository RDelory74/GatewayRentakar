/*
package Rentakar.Gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class GatewayConfig {

    @Bean
    public RestClient.Builder restClientBuilder() {
        return RestClient.builder();
    }

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("USERRENTAKAR", r -> r
                        .path("/users/**")
                        .filters(f -> f.stripPrefix(1))
                        .uri("lb://USERRENTAKAR"))
                .route("VEHICULERENTAKAR", r -> r
                        .path("/vehicules/**")
                        .filters(f -> f.stripPrefix(1))
                        .uri("lb://VEHICULERENTAKAR"))
                .route("ORDERRENTAKAR", r -> r
                        .path("/orders/**")
                        .filters(f -> f.stripPrefix(1))
                        .uri("lb://ORDERRENTAKAR"))
                .build();
    }
}*/
