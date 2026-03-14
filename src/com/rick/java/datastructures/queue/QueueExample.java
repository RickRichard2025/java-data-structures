package com.rick.java.datastructures.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Author: Rick_Richards
 * 
 * @since 11 mar 2026
 */

/*
 * Simple simulation of a customer service queue.
 * 
 * Customers arrive and join the line. The first customer in line is served
 * first.
 */

public class QueueExample {
	public static void main(String[] args) {

		Queue<String> customers = new LinkedList<>();

		customers.offer("Customer A");
		customers.offer("Customer B");
		customers.offer("Customer C");
		customers.offer("Customer D");
		customers.offer("Customer E");

		System.out.println("List of customers: " + customers);

		// First customer gets served:
		customers.poll();

		System.out.println("Updated List: " + customers);

	}

}
