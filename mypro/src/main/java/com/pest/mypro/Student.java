package com.pest.mypro;

import org.springframework.stereotype.Component;

@Component
public class Student {
	int sid;
	String name;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + "]";
	}
	

}