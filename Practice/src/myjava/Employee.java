package myjava;

import java.util.List;

public class Employee {
	private int id;
	private String name;
	private double salary;
    private int age;
    List<String> city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getCity() {
		return city;
	}
	public void setCity(List<String> city) {
		this.city = city;
	}
	public Employee(int id, String name, double salary, int age, List<String> city) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.city = city;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + ", city=" + city + "]";
	}
    
    
    
	
}
