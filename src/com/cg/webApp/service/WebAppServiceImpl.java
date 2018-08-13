//Service layer implementation with various methods
package com.cg.webApp.service;

import java.util.Collection;

import com.cg.webApp.dao.BookDao;
import com.cg.webApp.dao.BookDaoImpl;
import com.cg.webApp.pojo.Book;

public class WebAppServiceImpl implements WebAppService {

	private BookDao dao = new BookDaoImpl();
	Book book;

	@Override
	public Collection<Book> displayAllBooks() {
		return dao.displayAllBooks();
	}

	@Override
	public int addToCart(int bookId) {

		return dao.addToCart(bookId);
	}

	@Override
	public int removeFromCart(int bookId) {
		return dao.removeFromCart(bookId);
	}

	@Override
	public Collection<Book> viewCart() {
		return dao.viewCart();
	}
}
