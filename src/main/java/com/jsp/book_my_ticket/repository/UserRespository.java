package com.jsp.book_my_ticket.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.book_my_ticket.entity.User;

public interface UserRespository extends JpaRepository<User, Long>{
	
	boolean existsByEmail(String email);

	void deleteByRole(String string);

	User findByEmail(String email);
	
	List<User> findByRole(String string);

	boolean existsByMobile(Long mobile);
}
