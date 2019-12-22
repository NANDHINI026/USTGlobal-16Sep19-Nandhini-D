package com.ustglobal.librarymanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.librarymanagement.dto.BookDetails;
import com.ustglobal.librarymanagement.dto.BookRegistration;
import com.ustglobal.librarymanagement.dto.BookTransaction;
import com.ustglobal.librarymanagement.dto.User;



@Repository
public class LibraryManagementDAOImpl implements LibraryDAO{
	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public User registerUser(User user) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(user);
			transaction.commit();
			return user;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Boolean deleteStudent(int id) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		User user = manager.find(User.class, id);
		if(user!=null) {
			manager.remove(user);
			transaction.commit();
			return true;
		}else {
			return false;
		}
			}

	@Override
	public BookDetails addBooks(BookDetails bookDetails) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		try {
			transaction.begin();
			manager.persist(bookDetails);
			transaction.commit();
			return bookDetails;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Boolean deleteBook(int bookId) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		BookDetails bookDetails = manager.find(BookDetails.class, bookId);
		if(bookDetails!=null) {
			manager.remove(bookDetails);
			transaction.commit();
			return true;
		}else {
			return false;
		}
	}

	@Override
	public User getStudentInfo(int id) {
		EntityManager manager = factory.createEntityManager();
		User user = manager.find(User.class, id);
		return user;
	}

	@Override
	public List<BookRegistration> viewRequest() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookDetails> showAllBooks() {
		List<BookDetails> booksDetails = null;
		try {
			EntityManager manager = factory.createEntityManager();
			TypedQuery<BookDetails> query = manager.createQuery("from BookDetails", BookDetails.class);
			booksDetails = query.getResultList();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed to fetch the books from BookDetails");
		}
		return booksDetails;
	}

	@Override
	public User login(String email, String password) {
		String jpql = "from User where email=:email and password=:password";
		EntityManager manager = factory.createEntityManager();
        TypedQuery<User> query = manager.createQuery(jpql, User.class);
		query.setParameter("email", email);
		query.setParameter("password", password);
		try {
			User user = query.getSingleResult();
			return user;
		}catch (Exception e) {
			System.out.println(e.getMessage());	
			return null;
		}
	}

	@Override
	public boolean updateBook(BookDetails bookDetails) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		BookDetails books = manager.find(BookDetails.class, bookDetails.getBookId());
		books.setBookName(bookDetails.getBookName());
		books.setAuthor1(bookDetails.getAuthor1());
		books.setAuthor2(bookDetails.getAuthor2());
		books.setPublisher(bookDetails.getPublisher());
		books.setYearOfPublication(bookDetails.getYearOfPublication());
		transaction.commit();
		return true;
	}

	@Override
	public boolean requestBook(int id, int bookId) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			User user = manager.find(User.class, id);
			BookDetails bookDetails = manager.find(BookDetails.class, bookId);
			BookTransaction issue = new BookTransaction();
			issue.setBook(bookDetails);
			issue.setUser(user);
			manager.persist(issue);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

}
