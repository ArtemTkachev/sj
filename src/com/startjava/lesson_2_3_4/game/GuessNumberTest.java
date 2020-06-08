package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите имя первого игрока: ");
		Player firstPlayer = new Player(scan.nextLine());
		System.out.println("Введите имя второго игрока: ");
		Player secondPlayer = new Player(scan.nextLine());
		GuessNumber guessNumber = new GuessNumber(firstPlayer, secondPlayer);

		String resumeAnswer = "yes";
		while(resumeAnswer.equals("yes")) {
			guessNumber.play();
			do {
				System.out.println("Хотите продолжить? [yes/no]: ");
				resumeAnswer = scan.nextLine();
			} while(!resumeAnswer.equals("yes") && !resumeAnswer.equals("no"));
		}
	}
}