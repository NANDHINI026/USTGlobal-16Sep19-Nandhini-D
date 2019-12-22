package com.ustglobal.librarymanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.librarymanagement.dao.LibraryDAO;
import com.ustglobal.librarymanagement.dto.BookDetails;
import com.ustglobal.librarymanagement.dto.BookRegistration;
import com.ustglobal.librarymanagement.dto.User;
@Service
public class LibraryServiceImpl implements LibraryService{
	@Autowired
	private LibraryDAO dao;
	
	@Override
	public User login(String email, String password) {
		return dao.login(email, password);
	}

	@Override
	public User registerUser(User user) {
		return dao.registerUser(user);
	}
	@Override
	public BookDetails addBooks(BookDetails booksInventory) {
		return dao.addBooks(booksInventory);
	}

	@Override
	public Boolean deleteBook(int bookId) {
		return dao.deleteBook(bookId);
	}

	@Override
	public User getStudentInfo(int id) {
		return dao.getStudentInfo(id);
	}

	@Override
	public Boolean deleteStudent(int id) {
		return dao.deleteStudent(id);
	}

	@Override
	public List<BookRegistration> viewRequest() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookDetails> showAllBooks() {
		
		return dao.showAllBooks();
	}

	@Override
	public boolean updateBook(BookDetails bookDetails) {
		return dao.updateBook(bookDetails);
	}

	@Override
	public boolean requestBook(int id, int bookId) {
		return dao.requestBook(id, bookId);
	}

}
