package com.rick.java.datastructures.stack;

import java.util.Stack;

/**
 * Author: Rick_Richards
 * 
 * @since 11 mar 2026
 */
/*
 * A simple example that simulates browser history.
 * 
 * When a user visits pages, they are pushed onto the stack. When the user
 * presses "back", the last page is removed.
 */

public class StackExample {
	public static void main(String[] args) {

		Stack<String> browseHistory = new Stack<>();

		browseHistory.push("Youtube");
		browseHistory.push("Chat GPT");
		browseHistory.push("LinkedIn");
		browseHistory.push("GitHub");
		browseHistory.push("Whatsapp Web");

		System.out.println("Current history: " + browseHistory);

		// User presses back button
		browseHistory.pop();

		System.out.println("After pressing back: " + browseHistory);

		// Current page
		System.out.println("Current page: " + browseHistory.peek());

	}

}

/*
 * LIFO principle push() pop() peek()
 * 
 */
