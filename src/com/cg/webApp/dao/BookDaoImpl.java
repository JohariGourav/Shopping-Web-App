package com.cg.webApp.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.cg.webApp.pojo.Book;

public class BookDaoImpl implements BookDao {

	private Map<Integer, Book> bookDb = new HashMap<>();

	public Map<Integer, Book> cart = new HashMap<>();

	private void addBooks() {
		bookDb.put(101, new Book("Origin", 499, 101));
		bookDb.put(102, new Book("Wings Of Fire", 299, 102));
		bookDb.put(103, new Book("Rich Dad Poor Dad", 149, 103));
		bookDb.put(104, new Book("Chanakya Neeti", 199, 104));
		bookDb.put(105, new Book("Deception Point", 399, 105));
		bookDb.put(106, new Book("Turtles", 199, 106));
		bookDb.put(107, new Book("SpaceX", 699, 107));
		bookDb.put(108, new Book("Relativity", 199, 108));
		bookDb.put(109, new Book("Incredible India", 349, 109));
		bookDb.put(110, new Book("Born To Fly", 459, 110));
	}

	@Override
	public Collection<Book> displayAllBooks() {
		addBooks();
		return bookDb.values();
	}

	@Override
	public int addToCart(int bookId) {
		if (cart.containsKey(bookId)) {
			int quant = cart.get(bookId).getQuantity();
			System.out.println(cart.get(bookId).getQuantity());
			quant += 1;
			cart.get(bookId).setQuantity(quant);
			System.out.println("contains"+cart.get(bookId).getQuantity());
		} else {
			
			cart.put(bookId, bookDb.get(bookId));
			int quant = cart.get(bookId).getQuantity();
			quant += 1;
			cart.get(bookId).setQuantity(quant);
			//System.out.println(cart.values());
			System.out.println("else"+cart.get(bookId).getQuantity());
		}
		return cart.get(bookId).getBookPrice();
	}

	@Override
	public int removeFromCart(int bookId) {
		
		int price = cart.get(bookId).getBookPrice();
		if (cart.get(bookId).getQuantity() > 1) {
			System.out.println("contains remove"+cart.get(bookId).getQuantity());
			int quant = cart.get(bookId).getQuantity();
			quant -=1;
			cart.get(bookId).setQuantity(quant);
		} else {
			System.out.println("else remove"+cart.get(bookId).getQuantity());
			cart.remove(bookId);
		}

		return price;
	}

	@Override
	public Collection<Book> viewCart() {
		return cart.values();
	}
}
