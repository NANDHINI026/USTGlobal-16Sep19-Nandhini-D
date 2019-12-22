package com.ustglobal.librarymanagement.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ustglobal.librarymanagement.dto.LibraryResponse;


@RestControllerAdvice
public class HandleException {
	@ExceptionHandler(Exception.class)
	public LibraryResponse getException () {
		LibraryResponse response = new LibraryResponse();
		response.setStatusCode(501);
		response.setMessage("Error in code");
		response.setDescription("Got an Exception");
		return response;
	}

}
