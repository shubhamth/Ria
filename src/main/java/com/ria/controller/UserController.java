package com.ria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ria.model.User;
import com.ria.repository.UserRepository;
import com.ria.services.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;

	
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@GetMapping(path = { "user/{id}" })
	public User findOne(@PathVariable("id") int id) {
		return userService.findById(id);
	}

	@RequestMapping("hello")
	public String findOne() {
		return "Hello Shubham";
	}
}
