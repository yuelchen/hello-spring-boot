package com.yuelchen.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.yuelchen.model.User;

@Service
@CacheConfig(cacheNames = {"user"})
public class UserService {
	
	@Cacheable(value = "users")
	public List<User> getDefaultUsers() {
		
		List<User> defaultUsers = new ArrayList<>();
		for(int i=0; i<1000; i++) {
			if(i % 2 == 0) {
				defaultUsers.add(new User("hello_world@gmail.com", "user_" + i, "John", "Doe"));
			} else {
				defaultUsers.add(new User("hello_world@gmail.com", "user_" + i, "Jane", "Doe"));
			}
		}
		
		return defaultUsers;
	}
	
	@CacheEvict(value = "users", allEntries=true) 
	public void clearAllUsers() {
		// does nothing but clear cache
	}
}
