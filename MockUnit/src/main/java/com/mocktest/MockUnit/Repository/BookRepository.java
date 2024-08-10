package com.mocktest.MockUnit.Repository;

import java.util.List;

import com.mocktest.MockUnit.Model.Book;

public interface BookRepository {
	List<Book> findByDates(int a);
	void save(Book b);
	Book findBookById(Long id);

}
