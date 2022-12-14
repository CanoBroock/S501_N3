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


/*@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("")).paths(PathSelectors.any()).build();
    }
}*/
