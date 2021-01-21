package com.nelioalves.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.course.entities.User;
import com.nelioalves.course.repositories.UserRepository;


@Service
public class UserService {
	
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> finAll(){
		return userRepository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.get(); 
	}
	
	public User insert(User obj) {
		return userRepository.save(obj);
	}

}
