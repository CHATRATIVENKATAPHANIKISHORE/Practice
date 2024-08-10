package com.pest.mypro;

public class Person {
	int id;
	Address add;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", add=" + add + "]";
	}
	public Person(int id, Address add) {
		super();
		this.id = id;
		this.add = add;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

}
