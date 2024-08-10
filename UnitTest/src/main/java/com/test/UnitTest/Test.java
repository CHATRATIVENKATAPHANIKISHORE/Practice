package com.test.UnitTest;
class Animal {
	   public void move() {
	      System.out.println("Animals can move");
	   }
	}

	class Dog extends Animal {
	   public void move() {
	      super.move();   // invokes the super class method
	      System.out.println("Dogs can walk and run");
	   }
	}

public class Test {
	

		

		   public static void main(String args[]) {
		      Animal b = new Dog();   // Animal reference but Dog object
		      b.move();   // runs the method in Dog class
		      //Animals can move
		      //Dogs can walk and run
		     // Dog c = (Dog) new Animal();   // Animal reference but Dog object
		      //c.move();
		      //Type mismatch then ERror
		      try {
		          int a[] = new int[2];
		          int bb = 0;
		          int c = 1/bb;
		          System.out.println("Access element three :" + a[3]);
		       }
		      catch (ArrayIndexOutOfBoundsException e) {
		          System.out.println("ArrayIndexOutOfBoundsException thrown  :" + e);
		       }
		       catch (Exception e) {
		           System.out.println("Exception thrown  :" + e);
		       }
		      
		       System.out.println("Out of the block");
		    }
		      

		   }
		


