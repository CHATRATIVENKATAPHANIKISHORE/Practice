package com.test.UnitTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class TestThree {
	//Java Program to Remove Characters from the Input String which are Present in the Mask String
	//Input: Enter String: Practice Java String Programs
	//Enter Mask String: abc
	//Output: Prtie Jv String Progrms
	public static void main(String args[]) {
	String s = "Practice Java String Programs";
	String m = "abc";
	Set<Character> charsToRemove = m.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
	String result = s.chars()
            .mapToObj(c -> (char) c)
            .filter(c -> !charsToRemove.contains(c))
            .map(String::valueOf)
            .collect(Collectors.joining());
	System.out.println(result);
	//Java Program to Remove All Adjacent Duplicates from String
	//Input: String: ABBCCCD
	//Output: ACD
	String s2= "ABBCCCD";
	String adj=s2.chars()
            .mapToObj(c -> String.valueOf((char) c))
            .reduce("", (acc, current) -> {
                if (acc.isEmpty() || acc.charAt(acc.length() - 1) != current.charAt(0)) {
                    return acc + current;
                } else {
                    return acc;
                }
            });
	
	//Java Program to Reverse Each Word in a String
	//Input: String: Java Programs on String
	//Output: avaj smargorp no gnirts
	String s3 = "Java Programs on String";
	String[] words = s3.split("\\s+");	
	String reversedString = Arrays.stream(words)
            .map(word -> new StringBuilder(word).reverse())
            .collect(Collectors.joining(" "));
	//Java Program to Find the First Non-repeated Character in a String
	String s4= "Welcome to Sanfoundry";
	Map<Character, Long> charCountMap = s4.chars()
            .mapToObj(c -> (char) c)
            .collect(LinkedHashMap::new, 
                     (map, c) -> map.merge(c, 1L, Long::sum), 
                     LinkedHashMap::putAll);	
	System.out.println(charCountMap);
	Optional<Character> firstNonRepeatedChar = charCountMap.entrySet().stream()
            .filter(entry -> entry.getValue() == 1L)
            .map(Map.Entry::getKey)
            .findFirst();
	System.out.println(firstNonRepeatedChar);
	Optional<Character> secondNonRepeatedChar = charCountMap.entrySet().stream()
            .filter(entry -> entry.getValue() == 1L)
            .map(Map.Entry::getKey).skip(1).
            findFirst();
	System.out.println(firstNonRepeatedChar);
	
	
	 Map<Character, Integer> dp = new HashMap<>();
     String s5 = "abcabcabcddeffghu";
     // Iterate over each character in the string
      s5.chars().mapToObj(c -> (char) c)
             .forEach(c -> dp.put(c, Math.max(dp.getOrDefault(c, 0),
                                               s5.chars().mapToObj(c1 -> (char) c1)
                                               .filter(c1 -> c1 == c).toArray().length)));
      dp.forEach((key, value) -> System.out.println(key + " -> " + value));
    //Java Program to Find the Length of Longest Repeating Sequence in a String
  	//aabbbcc 3
      //Java Program to Count the Number of Unique Words
      
      String s6 = "Java is great but Python is also great and Python has great speed ";
      s6.split("\\s+");	
      Set unique = new HashSet<>();
      Arrays.stream(s6.split("\\s+")).map(word->word.toLowerCase()).distinct().forEach(c->System.out.print(c));	
      
      
      
      
      
    		  
	
	}
}
