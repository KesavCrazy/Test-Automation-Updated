package com.kesav.encapsulation;

public class BookRunner {

	public static void main(String[] args) {
		Book book = new Book();
		book.setNoOfCopies(100);
		System.out.println(book.getNoOfCopies());
		book.increaseNoOfCopies(150);
		System.out.println(book.getNoOfCopies());
		book.decreaseNoOfCopies(50);
		System.out.println(book.getNoOfCopies());
	}

}
