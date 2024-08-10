package myjava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Operations {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee(1, "John", 1000009, 25, Arrays.asList("Pune", "Mumbai"));	
		Employee emp2 = new Employee(2, "Rajaamarthand", 200, 30, Arrays.asList("Chennai", "Mumbai"));
		Employee emp3 = new Employee(3, "Saga", 3002, 35, Arrays.asList("Hyderabad", "Mumbai"));
		Employee emp4 = new Employee(1, "Sishya", 1000009, 25, Arrays.asList("Pune", "Mumbai"));	
		Employee emp5 = new Employee(2, "RaahulSHarma", 20000, 30, Arrays.asList("Chennai", "Mumbai"));
		Employee emp6 = new Employee(3, "Sagar", 3002, 35, Arrays.asList("Hyderabad", "Mumbai"));
		List<Employee> empList = Arrays.asList(emp, emp2, emp3,emp4,emp5,emp6);
		
		empList.stream().map(e -> {
			e.setSalary(e.getSalary() + 1000);
			return e;
		}).forEach(e -> System.out.println(e.getName() + " " + e.getSalary()));
		
		
		empList.stream().filter(e -> e.getAge() > 50).forEach(e -> System.out.println(e.getName()));
		empList.stream().filter(e -> e.getName().startsWith("S")).forEach(e -> System.out.println(e.getName()));
		
		
		
		empList.stream().filter(e -> e.getSalary() > 10000).map(e -> {
			e.setSalary(e.getSalary() - 5000);
			return e;
		}).filter(e -> e.getName().length() > 8).forEach(e -> System.out.println(e.getName() + " " + e.getSalary()));
		
		
		 
		empList.stream().forEach(e -> System.out.println(e.getName()));
		
		empList.stream().filter(e -> e.getSalary() > 10000).map(e -> {
			e.setSalary(e.getSalary() - 5000);
			return e;
		}).filter(e -> e.getName().length() > 8).forEach(e -> System.out.println(e.getName() + " " + e.getSalary()));
		
		
		empList.stream().forEach(e -> {
			int otp = (int) (Math.random() * 900000) + 100000;
			System.out.println(e.getName() + " " + otp);
		});
		
		Stream<Integer> mynums = Stream.of(1, 2, 3, 4, 6,7,8,32,76,23);
		
		mynums.filter(n -> n % 2 == 0).skip(2).forEach(n -> System.out.println(n));
		
		
		Stream<Integer> mynums1 = Stream.of(1, 2, 3, 4, 6,7,8,32,76,23);
		mynums1.filter(n -> n % 2 == 0).limit(2).forEach(n -> System.out.println(n));
		
		Stream<String> cityStream = empList.stream().map(e -> e.getCity()).flatMap(c -> c.stream()).distinct();
		cityStream.forEach(city -> {
			if (empList.stream().allMatch(e -> e.getCity().contains(city))) {
				System.out.println(city);
			}
		});
		empList.stream().map(e -> e.getName()).sorted().forEach(name -> System.out.println(name));
		
		empList.stream().sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary())).limit(3).forEach(e -> System.out.println(e));
		

		
		
		
		
	
		
		
		

		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		   
		
		
		
		
	}

}
