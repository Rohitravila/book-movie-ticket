package com.jsp.book_my_ticket.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jsp.book_my_ticket.entity.User;
import com.jsp.book_my_ticket.repository.UserRespository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@RequiredArgsConstructor
@Component
@Slf4j
public class AdminRegistration implements CommandLineRunner {
	@Value("${admin.email}")
	private String email;
	@Value("${admin.password}")
	private String password;

	private final UserRespository userRepository;

	@Override
	public void run(String... args) throws Exception {
		if (!userRepository.existsByEmail(email)) {
			User user = new User();
			user.setEmail(email);
			user.setPassword(AES.encrypt(password));
			user.setRole("ADMIN");
			user.setMobile(0L);
			user.setName("ADMIN");
			userRepository.save(user);
			log.info("Admin Registration Success");
		} else
			log.info("Admin Exists");
	}

}
