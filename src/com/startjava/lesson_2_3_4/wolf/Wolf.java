package com.startjava.lesson_2_3_4.wolf;

public class Wolf {

	private char gender;
	private int age;
	private int weight;
	private String nickname;
	private String color;

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age > 8) {
			System.out.println("Некорректный возраст");
		} else {
			this.age = age;
		}
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	public void go() {
		System.out.println("Go");
	}

	public void sit() {
		System.out.println("Sit");
	}

	public void run() {
		System.out.println("Run");
	}

	public String howl() {
		return "Auuuuuu!";
	}

	public void hunt() {
		System.out.println("Hunt");
	}
}