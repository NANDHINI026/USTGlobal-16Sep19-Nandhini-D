package com.ustglobal.exception.customizeduncheckedexception;

public class Validator {
	void verify(int age) {
		if (age < 18) {
			throw new InvalidAgeException("Try again Next time");
		}
	}
}
