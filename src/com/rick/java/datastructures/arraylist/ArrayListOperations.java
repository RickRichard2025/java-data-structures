package com.rick.java.datastructures.arraylist;

import java.util.ArrayList;

/**
 * Author: Rick_Richards
 * 
 * @since 11 mar 2026
 */
/*
 * With this last class I will demonstrate common operations with ArrayList.
 * 
 * I will: - add elements - remove elements - update elements - check if an
 * element exists
 */

public class ArrayListOperations {
	public static void main(String[] args) {

		ArrayList<String> student = new ArrayList<>();

		student.add("Rick");
		student.add("Richards");
		student.add("Samantha");
		student.add("Mia");
		student.add("Arnulfo");
		student.add("Josh");
		student.add("Megan");
		student.add("Maria");

		System.out.println("Students list: " + student); // their names

		// Updating an element
		student.set(0, "Doctor doom");

		// Removing an element
		student.remove(7);

		// Checking if a value exists
		boolean hasRick = student.contains("Richards");

		System.out.println("Updated list: " + student);
		System.out.println("List contains Rick? " + hasRick);

	}

}
