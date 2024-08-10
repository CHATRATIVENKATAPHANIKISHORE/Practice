package com.mocktest.MockUnit.Service;

import java.util.List;

import com.mocktest.MockUnit.Model.Book;
import com.mocktest.MockUnit.Repository.BookRepository;

public class BookService {
	
	BookRepository bookrepo;

	public BookService(BookRepository bookrepo) {
		super();
		this.bookrepo = bookrepo;
	}
	
	public Double calcCost(List<Long> bookids) {
		Double cost = 0.0;
		for(Long bookid : bookids) {
			Book book = bookrepo.findBookById(bookid);
			cost = cost + book.getPrice();
		}
		return cost;
		
	}
	
	

}
