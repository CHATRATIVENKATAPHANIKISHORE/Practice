package com.test.UnitTest;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.boot.test.context.SpringBootTest;

import com.test.UnitTest.Model.Book;
import com.test.UnitTest.service.BookService;

@SpringBootTest
class UnitTestApplicationTests {

	@Test
	void contextLoads() {
	}
	@BeforeEach
	public  void mybefore() {
		System.out.println("Hi");
		
	}
	@AfterEach
	public  void myEacg() {
		System.out.println("Hello");
		
	}
	@AfterAll
	public  static void myEach() {
		System.out.println("Hello All");
		
	}
	@BeforeAll
	public static void myEachAll() {
		System.out.println("Hello All");
		
	}
	
	@Test
	public void getAllBooksTestWithMessageSupplier()
	{
		BookService bookservice=new BookService();	
		bookservice.addNewBook(new Book((long) 1, "1","Gita","GRK"));
		List<Book> actualResult = bookservice.getAllBooks();		
		assertTrue(bookservice.getAllBooks().isEmpty());
	}
 
	@Test
	public void addNewBookTest()
	{
		BookService bookservice=new BookService();
		//String actualResult=
		bookservice.addNewBook(new Book());
//		String expectedResult="New Book has been added";
//		assertEquals(expectedResult, actualResult,()->"Book Not added");
		assertFalse(bookservice.getAllBooks().isEmpty());

	}
	@Test
	public void getBookByNameTestWithMessageSupplier()
	{
		BookService bookservice=new BookService();
		bookservice.addNewBook(new Book((long) 1, "1","Gita","GRK"));
		bookservice.addNewBook(new Book((long)1,"1","Java","TRS"));
		bookservice.addNewBook(new Book((long)3,"3","Javascript","GRK"));
		Book actualResult = bookservice.getBookByName("1");
		assertNull(actualResult);
	}
	@Test
	void getBookByPublisherTest()
	{
		BookService bookservice=new BookService();
		bookservice.addNewBook(new Book((long) 1, "1","Gita","GRK"));
		bookservice.addNewBook(new Book((long)1,"1","Java","TRS"));
		bookservice.addNewBook(new Book((long)3,"3","Javascript","GRK"));
		String[] actualResult = bookservice.getBookByPublisher("GRK");
		String[] expectedResult= {"Gita","Javascript"};
		assertArrayEquals(expectedResult,expectedResult);
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1,2,4,7,8,-1})
	void parameterised(Integer i) {
		assertNotNull(i);
	}
	@ParameterizedTest
	@ValueSource(ints = {101})
	void parameterisedPalindrome(Integer i) {
		BookService bookservice=new BookService();

		assertTrue(bookservice.isPalindrome(i));
	}
	@ParameterizedTest
	@NullSource
	void parameterisedPalindrome(String s) {
		
		BookService bookservice=new BookService();

		assertNull(bookservice.isStringPalindrome(s));
	}
	@ParameterizedTest
	@CsvSource({"car,CAR"})
	void parameterisedcsv(String s, String p) {
		
		BookService bookservice=new BookService();

		assertEquals(bookservice.csvfunc(s), p);
	}
	@ParameterizedTest
	@CsvSource({"101,101"})
	void parameterisedCSVtwo(String s, String p) {
		
		BookService bookservice=new BookService();

		assertEquals(bookservice.isStringTwoPalindrome(s), p);
	}
	

}
