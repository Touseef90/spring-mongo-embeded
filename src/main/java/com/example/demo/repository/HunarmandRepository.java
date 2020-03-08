package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.User;

public interface HunarmandRepository extends MongoRepository<User, Integer> {

	List<User> findByName(String name);

}
