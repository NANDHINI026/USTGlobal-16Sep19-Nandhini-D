package com.ustglobal.librarymanagement.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book_registration")
public class BookRegistration {
	@Id
	@Column
	@GeneratedValue
private int registrationId;
	@Column
private int bookId;
	@Column
private int userId;
	@Column
private Date registrationDate;
public int getRegistrationId() {
	return registrationId;
}
public void setRegistrationId(int registrationId) {
	this.registrationId = registrationId;
}
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public Date getRegistrationDate() {
	return registrationDate;
}
public void setRegistrationDate(Date registrationDate) {
	this.registrationDate = registrationDate;
}
}
