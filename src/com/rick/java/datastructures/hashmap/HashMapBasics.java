package com.rick.java.datastructures.hashmap;

import java.util.HashMap;

/**
 * Author: Rick_Richards
 * 
 * @since 11 mar 2026
 */
/*
 * Basic example of how HashMap works.
 * 
 * A HashMap stores data in key-value pairs. Each key is unique and maps to a
 * specific value.
 * 
 * This structure is commonly used when you need fast lookups using a key.
 */
public class HashMapBasics {
	public static void main(String[] args) {

		HashMap<Integer, String> futbolPlayers = new HashMap<>();

		// Adding key-value pairs
		futbolPlayers.put(1, "Messi");
		futbolPlayers.put(2, "Pele");
		futbolPlayers.put(3, "Maradona");
		futbolPlayers.put(4, "Johan Cruyf");
		futbolPlayers.put(5, "CR7");

		System.out.println("Futbol Players: " + futbolPlayers);

		// Accessing a player by key
		boolean hasKey = futbolPlayers.containsKey(1);
		System.out.println("Map contains key 1? " + hasKey); // true

		// Removing a player
		futbolPlayers.remove(3);

		System.out.println("After removing player 3(Maradona): " + futbolPlayers);

	}

}
