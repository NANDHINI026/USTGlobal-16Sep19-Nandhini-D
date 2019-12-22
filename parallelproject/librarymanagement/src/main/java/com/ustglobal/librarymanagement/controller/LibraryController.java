package com.ustglobal.librarymanagement.controller;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.librarymanagement.dto.BookDetails;
import com.ustglobal.librarymanagement.dto.LibraryResponse;
import com.ustglobal.librarymanagement.dto.User;
import com.ustglobal.librarymanagement.service.LibraryService;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class LibraryController {
	@Autowired
	private LibraryService service;
	@PostMapping(path = "/register", consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public  LibraryResponse  registerUser(@RequestBody User user) {
		LibraryResponse response = new LibraryResponse();
		if(service.registerUser(user) !=null) {
			response.setStatusCode(201);
			response.setMessage("User is successfully registered");
			response.setDescription("Data added to the DB");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not added to the DB");
		}
		return response;
	}// end of registerUser

	@PostMapping(path = "/login",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public  LibraryResponse  login(@RequestBody User user1) {
		LibraryResponse response = new LibraryResponse();
		User user = service.login(user1.getEmail(), user1.getPassword());
		if( user!=null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("You have logged in successfully");
			response.setUsers(user);
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Invalid credentials");
		}
		return response;
	}
	@PostMapping(path = "/addbooks", consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public  LibraryResponse  registerUser(@RequestBody BookDetails bookDetails) {
		LibraryResponse response = new LibraryResponse();
		if(service.addBooks(bookDetails) !=null) {
			response.setStatusCode(201);
			response.setMessage("Book added successfully");
			response.setDescription("book added to the DB");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Book not added to the DB");
		}
		return response;
	}// end of addBook
	@GetMapping(path = "/get-all-books",produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse showAllBooks() {
		LibraryResponse response = new LibraryResponse();
		List<BookDetails> beans = service.showAllBooks();
		if(!beans.isEmpty()) {
			response.setStatusCode(201);
			response.setMessage("Books fetched successfully ");
			response.setDescription("Data got from  the DB");
			response.setBean(beans);
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Books can't be fetched");
		}
		return response;
	}//end of showAllBooks
	
	@GetMapping(path = "/get-student/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse getStudentInfo(@PathVariable("id")int id) {
		LibraryResponse response = new LibraryResponse();
		User user=service.getStudentInfo(id);
		
		if(user!=null) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data found in  the DB");
			response.setUser(Arrays.asList(user));
		}else {
			response.setStatusCode(401);
			response.setMessage("success");
			response.setDescription("Data not found in the DB");
		}
		return response;
	}//end of getStudent
	
	@DeleteMapping(path = "/delete-student/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public  LibraryResponse deleteEmployee(@PathVariable("id")int id) {
		LibraryResponse response = new LibraryResponse();
		if(service.deleteStudent(id)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data deleted from  the DB");
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Data not deleted from the DB");
		}
		return response;
	}//end of deleteStudent
	@DeleteMapping(path = "/delete-book/{bookId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public  LibraryResponse deleteBook(@PathVariable("bookId")int bookId) {
		LibraryResponse response = new LibraryResponse();
		if(service.deleteBook(bookId)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data deleted from  the DB");
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Data not deleted from the DB");
		}
		return response;
	}//end of deleteStudent
	@PutMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse updateBook(@RequestBody BookDetails  bookDetails) {
		LibraryResponse response = new LibraryResponse();
		if(service.updateBook(bookDetails)) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Data Modified in DB");
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Data cannot be modified DB");
		}
		return response;
	}
	@GetMapping(path = "/request/{id}/{bookId}", consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public LibraryResponse requestBook(@PathVariable("id")int id,@PathVariable("bookId")int bookId) {
		LibraryResponse response = new LibraryResponse();
		Boolean bean = service.requestBook(id,bookId);
		if(bean) {
			response.setStatusCode(201);
			response.setMessage("success");
			response.setDescription("Book requested successfully");
		}else {
			response.setStatusCode(401);
			response.setMessage("failure");
			response.setDescription("Book cannot be requested");
		}
		return response;
	}
}
