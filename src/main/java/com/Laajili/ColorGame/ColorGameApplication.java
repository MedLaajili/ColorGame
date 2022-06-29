package com.Laajili.ColorGame;

import com.Laajili.ColorGame.Model.User;
import com.Laajili.ColorGame.Service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class ColorGameApplication {

	public static void main(String[] args) {

		SpringApplication.run(ColorGameApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	CommandLineRunner run(UserService userService){
		return args -> {
			userService.saveUser(new User(null,"mohamed.laajili@polytechnicien.tn","50185440"));
		};
	}

}
