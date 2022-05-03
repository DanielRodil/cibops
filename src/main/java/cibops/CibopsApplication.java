package cibops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:config/jpa-config.xml"})
public class CibopsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CibopsApplication.class, args);
	}

}
