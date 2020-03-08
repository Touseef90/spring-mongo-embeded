package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.repository.HunarmandRepository;

@RestController
@RequestMapping("/hunarmand")
public class UserController {
	
	@Autowired
	private HunarmandRepository repository;
	
	@PostMapping("/saveUserNow")
	public String saveUser(@RequestBody User user) {
		repository.save(user);
		return "User saved";
	}
	
	@GetMapping("/getUserByName/{name}")
	public List<User> getUserByName(@PathVariable String name) {
		return repository.findByName(name);
	}

}
