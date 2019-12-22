package com.ustglobal.librarymanagement.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import net.bytebuddy.build.ToStringPlugin.Exclude;





@Entity
@Table(name="book_details")
public class  BookDetails{
	@Id
	@Column
	@GeneratedValue
	private int bookId;
	@Column
	private String bookName;
	@Column
	private String author1;
	@Column
	private String author2;
	@Column
	private String publisher;
	@Column
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date yearOfPublication;
	@JsonIgnore
	@Exclude
	@OneToMany(mappedBy = "book")
	private List<BookTransaction> issuebook;
	
	public List<BookTransaction> getIssuebook() {
		return issuebook;
	}
	public void setIssuebook(List<BookTransaction> issuebook) {
		this.issuebook = issuebook;
	}
	public Date getYearOfPublication() {
		return yearOfPublication;
	}
	public void setYearOfPublication(Date yearOfPublication) {
		this.yearOfPublication = yearOfPublication;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor1() {
		return author1;
	}
	public void setAuthor1(String author1) {
		this.author1 = author1;
	}
	public String getAuthor2() {
		return author2;
	}
	public void setAuthor2(String author2) {
		this.author2 = author2;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
}
