package com.test.UnitTest.service;

import java.util.List;

import com.test.UnitTest.Model.Book;

public class BookService {
	static {
		
	}

	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addNewBook(Book book) {
		// TODO Auto-generated method stub
		
		
	}

	public Book getBookByName(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String[] getBookByPublisher(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean isPalindrome(int n) {
		// TODO Auto-generated method stub
		int r,sum=0,temp;    
		 //It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
			   return true;
			  else    
			   return false;
	}

	public Object isStringPalindrome(String i) {
		if(i==null) {
			return null;
		}
		Long n = Long.parseLong(i);
		Long r,temp;   
		 //It is the number variable to be checked for palindrome  
		  Long sum =(long) 0;
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
			   return true;
			  else    
			   return false;
		
		  
		  
		  
		// TODO Auto-generated method stub
	
	}

	public Object csvfunc(String s) {
		
		// TODO Auto-generated method stub
		return s.toUpperCase();
	}

	public Object isStringTwoPalindrome(String i) {
		// TODO Auto-generated method stub
		Long n = Long.parseLong(i);
		Long r,temp;   
		 //It is the number variable to be checked for palindrome  
		  Long sum =(long) 0;
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
			   return i;
			  else    
			   return false;	}

}
