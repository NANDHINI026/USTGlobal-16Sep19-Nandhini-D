package com.ustglobal.librarymanagement.dao;

import java.util.List;

import com.ustglobal.librarymanagement.dto.BookDetails;
import com.ustglobal.librarymanagement.dto.BookRegistration;
import com.ustglobal.librarymanagement.dto.User;

public interface LibraryDAO {
	public User login(String email, String password);
	public User registerUser(User user);
	public BookDetails addBooks(BookDetails booksInventory);
	public Boolean deleteBook(int bookId);
	public User getStudentInfo(int id);
	public Boolean deleteStudent(int id);
	public List<BookRegistration> viewRequest();
	public List<BookDetails> showAllBooks();
	public boolean  updateBook(BookDetails bookDetails);
	public boolean requestBook(int id, int bookId);
}
