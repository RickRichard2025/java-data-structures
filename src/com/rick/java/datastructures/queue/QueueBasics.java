package com.rick.java.datastructures.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Author: Rick_Richards
 * 
 * @since 11 mar 2026
 */
/*
 * Basic example of a Queue in Java.
 * 
 * A queue follows the FIFO principle: First In, First Out.
 * 
 * The first element added to the queue will be the first one removed.
 */
public class QueueBasics {
	public static void main(String[] args) {

		Queue<String> soccerTeams = new LinkedList<>();

		// Adding the elements
		soccerTeams.offer("Barcelona");
		soccerTeams.offer("Milan");
		soccerTeams.offer("Boca Juniors");
		soccerTeams.offer("Manchester United");
		soccerTeams.offer("Santos");

		System.out.println("Teams: " + soccerTeams);

		// Looking the first team
		System.out.println("First team is: " + soccerTeams.peek());

		// removing the first team
		soccerTeams.poll();

		System.out.println("Updated List: " + soccerTeams);

	}
}
