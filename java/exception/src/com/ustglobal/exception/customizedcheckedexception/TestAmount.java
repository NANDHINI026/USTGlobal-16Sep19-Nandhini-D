package com.ustglobal.exception.customizedcheckedexception;

public class TestAmount {
	public static void main(String[] args) {
		System.out.println("Main Started");

		ValidateAmount va = new ValidateAmount();

		try {
			va.checkAmount(40000);
			System.out.println("Withdraw your Money");

		} catch (InvalidAmountException e) {
			System.err.println(e.getMessage());
		}

		System.out.println("Main Ended");
	}
}
