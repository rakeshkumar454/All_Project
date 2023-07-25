package com.book;

import java.util.ArrayList;

public class BookStrore {

	private ArrayList<Book> bookList;

	public BookStrore(ArrayList<Book> bookList) {
		super();
		this.bookList = bookList;
	}

	public void addBook(Book book) {

		bookList.add(book);
	}

	public int searchByTitle(String title) {
		for (Book book : bookList) {
			if (book.getTitle().equalsIgnoreCase(title)) {
				
				return bookList.indexOf(book);
			}
		}
		return -1;
	}

	public int searchByAuthor(String author) {
		for (Book book : bookList) {
			if (book.getAuthor().equalsIgnoreCase(author)) {
				return bookList.indexOf(book);
			}
		}
		return -1;
	}

	public void displayAll() {

		bookList.forEach(System.out::println);
	}

}
