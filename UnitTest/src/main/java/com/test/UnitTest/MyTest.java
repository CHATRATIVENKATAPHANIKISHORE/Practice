package com.test.UnitTest;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MyTest {
	//Map<Character, Long> charFrequency = Arrays.stream("asdfghjklfghjkl".split("")).flatMap(a -> a.chars().mapToObj(c -> (char) c)) // Stream<Character>
	       // .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
public static void main(String args[]) {
	Map<Character, Long> charFrequency = Arrays.stream("asdfghjklfghjkl".split("")).flatMap(a -> a.chars().mapToObj(c -> (char) c)) 
	        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	System.out.println(charFrequency);
	
}
}
