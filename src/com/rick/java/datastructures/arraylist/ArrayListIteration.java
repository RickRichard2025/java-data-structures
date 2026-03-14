package com.rick.java.datastructures.arraylist;

import java.util.ArrayList;

/**
 * Author: Rick_Richards
 * 
 * @since 11 mar 2026
 */

/*
 * This example shows different ways to iterate over an ArrayList.
 * 
 * Iterating through collections is something you will do very often when
 * working with data in Java applications.
 */
public class ArrayListIteration {
	public static void main(String[] args) {

		// ArrayList has been created
		ArrayList<String> cities = new ArrayList<>();

		// List for my ArrayList

		cities.add("Paris");
		cities.add("Rome");
		cities.add("Whashington");
		cities.add("Quebec");
		cities.add("Barcelona");
		cities.add("Tokyo");
		cities.add("San Salvador");

		// 1. for this frist example I'll use the classic 'FOR' loop
		System.out.println("List of the most amazing cities around the World");
		for (int i = 0; i < cities.size(); i++) {
			if (i < cities.size() - 1) {
				System.out.print(cities.get(i) + ", ");
			} else {
				System.out.println(cities.get(i) + ".");
			}

		}
		System.out.println("");

		// 2. For this one I am going to use the Enhanced 'FOR' loop and add the counter
		// manually
		int counter = 0;

		for (String city : cities) {

			if (counter < cities.size() - 1) {
				System.out.print(city + ", ");
			} else {
				System.out.print(city + ".");
			}
			counter++;
		}

	}
}