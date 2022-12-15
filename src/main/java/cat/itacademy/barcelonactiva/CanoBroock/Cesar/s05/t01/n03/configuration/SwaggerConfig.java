package cat.itacademy.barcelonactiva.CanoBroock.Cesar.s05.t01.n03.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
class SwaggerConfig{
    @Bean
    WebClient webClient(WebClient.Builder builder) {
        return builder.build();
    }
}

