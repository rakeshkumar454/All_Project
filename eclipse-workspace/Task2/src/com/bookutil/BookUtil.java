package com.bookutil;

import java.util.ArrayList;

import com.book.Book;
import com.book.BookStore;
import com.exception.InValidBookException;


public class BookUtil {

	public static void main(String[] args) throws InValidBookException{

		BookStore bookstore= new BookStore();
		try {
			Book book1= new Book("B001","Physics","YXZ","Science", 450);
			Book book2= new Book("B002","Chemistry","Rakesh","Fiction", 1000);
			Book book3= new Book("B003","Detective","Ashish","Others", 500);
			Book book4= new Book("B004","Java","shyam","coding", 650);
			
			bookstore.addBook(book1);
			bookstore.addBook(book2);
			bookstore.addBook(book3);
			bookstore.addBook(book4);
			bookstore.searchByTitle("Java");
			System.out.println("\n");
			bookstore.searchByAuthor("Rakesh");
			bookstore.displayAll();
			
		}catch(InValidBookException e) {
			System.out.println("Exception throw : "+e.getMessage());
		}

	}

}
