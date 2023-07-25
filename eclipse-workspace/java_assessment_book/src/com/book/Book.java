package com.book;

import com.exception.InValidBookException;

public class Book {

	private String bookId;
	private String title;
	private String author;
	private String category;
	private float price;

	public Book() {
		super();
	}

	public Book(String bookId, String title, String author, String category, float price) {

		super();

		// Validations

		// ID Validation
		if (bookId.startsWith("B") && bookId.length() == 4) {
			this.bookId = bookId;
		} else {
			throw new InValidBookException("InValid Book ID : " + bookId);
		}

		// Price Validation
		if (price > 0) {
			this.price = price;
		} else {
			throw new InValidBookException("Invalid Book Price : " + price);
		}

		// CategoryValidation
		if (category.equalsIgnoreCase("Science") || category.equalsIgnoreCase("Fiction")
				|| category.equalsIgnoreCase("Technology") || category.equalsIgnoreCase("Others")) {
			this.category = category;

		} else {
			throw new InValidBookException("Invalid book category : " + category);
		}

		this.title = title;
		this.author = author;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", category=" + category
				+ ", price=" + price + "]";
	}

}
