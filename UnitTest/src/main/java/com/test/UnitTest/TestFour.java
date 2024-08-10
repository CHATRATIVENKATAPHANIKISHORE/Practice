package com.test.UnitTest;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class TestFour {

	
	    public static void main(String[] args) {
	        String inputString = "minimum";

	        Optional<Character> secondNonRepeatedChar = findSecondNonRepeatedChar(inputString);

	        if (secondNonRepeatedChar.isPresent()) {
	            System.out.println("Second non-repeated character: " + secondNonRepeatedChar.get());
	        } else {
	            System.out.println("No second non-repeated character found.");
	        }
	    }

	    public static Optional<Character> findSecondNonRepeatedChar(String str) {
	        // Create a LinkedHashMap to preserve insertion order
	        Map<Character, Long> charCountMap = str.chars()
	                .mapToObj(c -> (char) c)
	                .collect(LinkedHashMap::new, 
	                         (map, c) -> map.merge(c, 1L, Long::sum), 
	                         LinkedHashMap::putAll);

	        // Find the second character with frequency 1
	        Optional<Character> secondNonRepeatedChar = charCountMap.entrySet().stream()
	                .filter(entry -> entry.getValue() == 1L)
	                .skip(1) // Skip the first non-repeated character
	                .map(Map.Entry::getKey)
	                .findFirst();

	        return secondNonRepeatedChar;
	    }
	}



