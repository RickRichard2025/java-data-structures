package com.rick.java.datastructures.stack;

import java.util.Stack;

/**
 * Author: Rick_Richards
 * 
 * @since 11 mar 2026
 */
/*
 * Basic example of how a Stack works in Java.
 * 
 * A stack follows the LIFO principle: Last In, First Out.
 * 
 * The last element added to the stack will be the first one removed.
 */
public class StackBasics {
	public static void main(String[] args) {

		Stack<String> videoGamesPs2 = new Stack<>();

		// Here I am adding the elements/videogames to the stack
		videoGamesPs2.push("God of war");
		videoGamesPs2.push("God of war II");
		videoGamesPs2.push("Need for speed Underground II");
		videoGamesPs2.push("Resident Evil 4");
		videoGamesPs2.push("Silent Hill 2");

		System.out.println("Stack: " + videoGamesPs2);
		System.out.println("");

		// Looking at the top element without removing it
		System.out.println("Top videogame is: " + videoGamesPs2.peek());

		// Removing the top element or last one LIFO
		videoGamesPs2.pop();

		System.out.println("Top element is: " + videoGamesPs2.peek()); // Resident Evil 4
	}

}
