package com.ustglobal.springboot.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.ustglobal.springboot.dto.EmployeeResponse;

/*@ControllerAdvice*/ //this is for springmvc,if we write this we should write ResponseBody
@RestControllerAdvice
public class HandleException {
	@ExceptionHandler(Exception.class)
	public /*@ResponseBody*/ EmployeeResponse getException () {
		EmployeeResponse response = new EmployeeResponse();
		response.setStatusCode(501);
		response.setMessage("Error in code");
		response.setDescription("Got an Exception");
		return response;
	}
}
