package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
	private String name;
	private int[] numbers = new int[10];

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setNumber(int index, int number) {
		this.numbers[index] = number;
	}

	public int[] getNumbers(int quantity) {
		return Arrays.copyOf(numbers, quantity);
	}

	public void setEmptyValues(int toIndex) {
		Arrays.fill(numbers, 0, toIndex, 0);
	}
}