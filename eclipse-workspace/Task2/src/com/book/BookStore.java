package com.book;

import java.util.ArrayList;
import java.util.List;

public class BookStore {

	private ArrayList<Book> bookList;

	public static List<Book> books=new ArrayList<>();

	public void addBook(Book book) {

		books.add(book);
	}
	
	
//method to search book from the list with given title 
	
	
	public void searchByTitle(String title) {
		boolean flag = false;
		for(Book book:books) {
			if(book.getTitle().equals(title)) {
				System.out.println("Details of book with : "+books);
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println("No book found with title : ");
		}
	}

	public void searchByAuthor(String author) {
		boolean flag= false;
		for (Book book : books) {
			if (book.getAuthor().equals(author)) {
				System.out.println("Details of the book with given author: "+books);
				flag=true;
				break;
				
			}
		}
		if(!flag) {
			System.out.println("No book with given author : ");
		}
	}

	public void displayAll() {

		books.forEach(System.out::println);
	}

}
