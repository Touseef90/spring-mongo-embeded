package com.example.demo.model;

import org.springframework.data.annotation.Id;

public class Comment {
	
	@Id
	private int id;
	private int userId;
	private String body;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}

}
