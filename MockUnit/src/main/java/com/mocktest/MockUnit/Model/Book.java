package com.mocktest.MockUnit.Model;

import java.util.Objects;

public class Book {
	private Long id;
	private String title;
	private String publishedDate;
	private String author;
	private double price;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(String publishedDate) {
		this.publishedDate = publishedDate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, id, price, publishedDate, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(id, other.id)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(publishedDate, other.publishedDate) && Objects.equals(title, other.title);
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", publishedDate=" + publishedDate + ", author=" + author
				+ ", price=" + price + "]";
	}
	public Book(Long id, String title, String publishedDate, String author, double price) {
		super();
		this.id = id;
		this.title = title;
		this.publishedDate = publishedDate;
		this.author = author;
		this.price = price;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
