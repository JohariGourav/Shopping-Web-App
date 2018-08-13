package com.cg.webApp.pojo;

public class Book {

	private String bookName;
	private int bookPrice;

	private int bookId;
	private int quantity=0;

	// Arg Ctor..

	public Book(String bookName, int bookPrice, int bookId) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookId = bookId;
	}

	public int getBookId() {
		return bookId;
	}

	// getters
	public String getBookName() {
		return bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
