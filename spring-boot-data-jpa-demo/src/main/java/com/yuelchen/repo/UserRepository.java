package com.yuelchen.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.yuelchen.model.User;

public interface UserRepository extends CrudRepository<User, Integer>{

	User findById(int id);
	
	User findByUsername(String username);
	
	List<User> findByFirstName(String firstName);
	
	List<User> findByLastName(String lastName);
}