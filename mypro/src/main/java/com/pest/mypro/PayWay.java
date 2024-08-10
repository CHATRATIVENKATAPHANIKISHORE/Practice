package com.pest.mypro;

public class PayWay {
	
	   private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PayWay [name=" + name + "]";
	}

	public PayWay(String name) {
		super();
		this.name = name;
	}

	public PayWay() {
		super();
		// TODO Auto-generated constructor stub
	}

}
