package com.ustglobal.librarymanagement.dto;

import java.util.List;


public class LibraryResponse {
	private int statusCode;
	private String message;
	private String description;
	private User users;
	public User getUsers() {
		return users;
	}
	public void setUsers(User users) {
		this.users = users;
	}
	private List<User> user;
	private List<BookDetails> bean;
	public List<BookDetails> getBean() {
		return bean;
	}
	public void setBean(List<BookDetails> bean) {
		this.bean = bean;
	}
	public List<User> getUser() {
		return user;
	}
	public void setUser(List<User> user) {
		this.user = user;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
