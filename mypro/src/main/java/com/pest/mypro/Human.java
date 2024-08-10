package com.pest.mypro;

import java.util.Objects;

import javax.annotation.PostConstruct;

public class Human {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@PostConstruct
	public void init() {
		System.out.println("Started Human");
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human other = (Human) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Human [name=" + name + "]";
	}

	public Human(String name) {
		super();
		this.name = name;
	}

	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}

}
