package com.tiagofranca.accesscontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tiagofranca.accesscontrol.domain.User;
import com.tiagofranca.accesscontrol.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class AccessControlApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccessControlApiApplication.class, args);
	}

    @Bean
    CommandLineRunner testUser(UserRepository repository) {
        return args -> {
            User user = User.builder()
                    .username("admin")
                    .password("123")
                    .active(true)
                    .createdAt(LocalDateTime.now())
                    .build();

            repository.save(user);
        };

    }
}
