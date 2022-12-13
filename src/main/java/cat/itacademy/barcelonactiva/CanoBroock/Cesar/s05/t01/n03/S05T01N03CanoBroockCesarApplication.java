package cat.itacademy.barcelonactiva.CanoBroock.Cesar.s05.t01.n03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class S05T01N03CanoBroockCesarApplication {

	public static void main(String[] args) {
		SpringApplication.run(S05T01N03CanoBroockCesarApplication.class, args);
	}

}
