package com.test.UnitTest.Model;



public class Book {
	
	
	private Long bid;
	private String bookname;
	private String publisher;
	private String author;
	
	public Long getBid() {
		return bid;
	}
	public void setBid(Long bid) {
		this.bid = bid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bookname=" + bookname + ", publisher=" + publisher + ", author=" + author + "]";
	}
	public Book(Long bid, String bookname, String publisher, String author) {
		super();
		this.bid = bid;
		this.bookname = bookname;
		this.publisher = publisher;
		this.author = author;
	}
	

}
