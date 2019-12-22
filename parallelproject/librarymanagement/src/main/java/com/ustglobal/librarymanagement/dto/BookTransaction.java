package com.ustglobal.librarymanagement.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="book_transaction")
public class BookTransaction {

	@Id
	@Column
	@GeneratedValue
	private int transactionId;
	@Column
	private int registrationId;
	/*@Column
	private Date issueDate;
	@Column
	private Date returnDate;
	*/
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id", nullable = false)
	private User user;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bookId", nullable = false)
	private BookDetails book;
	
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public BookDetails getBook() {
		return book;
	}

	public void setBook(BookDetails book) {
		this.book = book;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public int getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(int registrationId) {
		this.registrationId = registrationId;
	}

//	public Date getIssueDate() {
//		return issueDate;
//	}
//
//	public void setIssueDate(Date issueDate) {
//		this.issueDate = issueDate;
//	}
//
//	public Date getReturnDate() {
//		return returnDate;
//	}
//
//	public void setReturnDate(Date returnDate) {
//		this.returnDate = returnDate;
//	}

	

	

}
