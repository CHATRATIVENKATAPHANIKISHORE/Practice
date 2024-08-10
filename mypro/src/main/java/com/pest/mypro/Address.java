package com.pest.mypro;

import java.util.Objects;

public class Address {
	 String street;
	 String city;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, street);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(city, other.city) && Objects.equals(street, other.street);
	}

	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


}
