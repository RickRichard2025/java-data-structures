package com.rick.java.datastructures.hashset;

import java.util.HashSet;

/**
 * Author: Rick_Richards
 * 
 * @since 11 mar 2026
 */
/*
 * Basic introduction to HashSet.
 * 
 * A HashSet stores unique elements. If you try to add a duplicate value, the
 * set simply ignores it.
 * 
 * Order is not guaranteed.
 */
public class HashSetBasics {
	public static void main(String[] args) {

		HashSet<String> countries = new HashSet<>();

		countries.add("El Salvador");
		countries.add("Brazil");
		countries.add("Japan");
		countries.add("United State");
		countries.add("Italy");

		// Trying to add a duplicated
		countries.add("El Salvador");

		System.out.println("List of countries: " + countries);

		// Checking the size
		System.out.println("Total countries: " + countries.size());

	}

}
