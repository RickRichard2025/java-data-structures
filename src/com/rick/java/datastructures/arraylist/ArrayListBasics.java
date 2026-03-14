package com.rick.java.datastructures.arraylist;

import java.util.ArrayList;

/**
 * Author: Rick_Richards
 * 
 * @since 11 mar 2026
 */
/*
 * Simple introduction to ArrayList.
 * 
 * This example shows: - how to create an ArrayList - how to add elements - how
 * to access elements - how to check the size of the list
 * 
 * ArrayList is a dynamic array that can grow as we add more elements.
 */

public class ArrayListBasics {
	public static void main(String[] args) {

		// This is gonna be the array that will store the Strings
		ArrayList<String> fruits = new ArrayList<>();

		// Adding the elements to ArrayList
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
		fruits.add("Strawberry");
		fruits.add("Coconut");
		fruits.add("Watermelow");
		fruits.add("Pear");
		fruits.add("Melon");
		fruits.add("Mango");
		fruits.add("Avocado");

		// Printing the entire list with their names:
		System.out.println("The list of fruits is: " + fruits + "\n");

		// Here we are accessing to the elements using the index
		System.out.println("First fruit is: " + fruits.getFirst() + "\n");

		// This one I am gonna confirm or check the size of the list
		System.out.println("Total of fruits are: " + fruits.size());

		// Last one: you can choose the index example 4(Coconut)
		System.out.println("The fifth fruit is: " + fruits.get(4));
	}
}
