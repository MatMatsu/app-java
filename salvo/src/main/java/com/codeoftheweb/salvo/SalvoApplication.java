package com.codeoftheweb.salvo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SalvoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalvoApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(PlayerRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new Player("qwerty@mail.com"));
			repository.save(new Player("example@mail.com"));
			repository.save(new Player("mail@mail.com"));
			repository.save(new Player("abc@gmail.com"));
			repository.save(new Player("1234@hotmail.com"));
			repository.save(new Player("asd@outlook.com"));
			repository.save(new Player("etc@yahoo.com"));
		};
	}

}
