package br.com.ifpe.oxifood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class OxifoodWlademirApplication {

	public static void main(String[] args) {
		SpringApplication.run(OxifoodWlademirApplication.class, args);
	}

}
