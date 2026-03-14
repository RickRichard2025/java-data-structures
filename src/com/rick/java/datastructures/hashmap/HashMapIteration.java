package com.rick.java.datastructures.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Rick_Richards
 * 
 * @since 11 mar 2026
 */
/*
 * Demonstrates how to iterate through a HashMap.
 * 
 * There are several ways to loop through the data. The most common ones are
 * using keySet() and entrySet().
 */

public class HashMapIteration {
	public static void main(String[] args) {

		HashMap<String, Integer> smartphones = new HashMap<>();

		smartphones.put("S24 Ultra", 1);
		smartphones.put("iPhone 16Ultra", 2);
		smartphones.put("Nothing Phone 3a", 3);
		smartphones.put("Oppo Find X9 Pro", 4);
		smartphones.put("Google Pixel9a", 5);

		System.out.println("Best smartphones in 2026: " + smartphones);

		// Iterating using keySet
		System.out.println("\nUsing KeySet:");
		for (Map.Entry<String, Integer> entry : smartphones.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

	}

}

//Let's remember that HasMap does not guarantee an order from 1 to 5