package com.rick.java.datastructures.hashset;

import java.util.HashSet;

/**
 * Author: Rick_Richards
 * 
 * @since 11 mar 2026
 */
/*
 * Demonstrates common operations with HashSet.
 * 
 * We will: - add elements - check if a value exists - remove elements - iterate
 * through the set
 */

public class HashSetOperations {
	public static void main(String[] args) {

		HashSet<String> languages = new HashSet<>();

		// Adding languages
		languages.add("Spanish");
		languages.add("English");
		languages.add("French");
		languages.add("German");
		languages.add("Japanese");

		System.out.println("Languages: " + languages);

		// Checking if a value exists
		boolean hasJava = languages.contains("Chinese");
		System.out.println("Has languages Chinese? " + hasJava); // false

		// Removing a language
		languages.remove("German");

		System.out.println("After removing a language:" + languages);

		int count = 0;
		int size = languages.size();

		System.out.println("Iterating through the set");

		for (String language : languages) {
			count++;
			if (count < size) {

				System.out.print(language + ", ");
			} else {
				System.out.print(language + ".");
			}

		}

	}

}
