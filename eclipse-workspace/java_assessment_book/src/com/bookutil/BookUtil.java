package com.bookutil;

import java.util.ArrayList;

import com.book.Book;
import com.book.BookStrore;
import com.exception.InValidBookException;

public class BookUtil {

	public static void main(String[] args) {

		ArrayList<Book> bookList = new ArrayList<Book>();

		BookStrore bookStore = new BookStrore(bookList);

		// adding books

		try {

			bookStore.addBook(new Book("B101", "Java", "Author1", "Technology", 1500));
			bookStore.addBook(new Book("B102", "Python", "Author2", "Technology", 1000));
			bookStore.addBook(new Book("B103", "C", "Author3", "Technology", 800));

		} catch (InValidBookException e) {
			System.out.println(e);
		}

		// searching books
		
		System.out.println("Searching : ");

		int index = bookStore.searchByAuthor("Author1");
		if (index != -1) {
			System.out.println("Search is successful and found at index :" + index+" and the Book : ");
			System.out.println(bookList.get(index));
		} else {
			System.out.println("Book not found in the store");
		}

		// display all the books

		System.out.println("\nDisplay All Books : ");
		bookStore.displayAll();

	}

}
