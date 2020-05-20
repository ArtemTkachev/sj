import java.util.Scanner;

public class GuessNumber {
	private Player firstPlayer;
	private Player secondPlayer;

	public GuessNumber(Player firstPlayer, Player secondPlayer) {
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
	}

	public void game(Scanner scan) {
		String resumeAnswer = "yes";
		int randomNumber;

		while(resumeAnswer.equals("yes")) {
			randomNumber = (int) (Math.random() * 101);
		//	System.out.println(randomNumber);
			System.out.println("Компьютер загадал число от 0 до 100");
			System.out.println("Игрок " + firstPlayer.getName() + ", введите число: ");
			firstPlayer.setNumber(scan.nextInt());
			System.out.println("Игрок " + secondPlayer.getName() + ", введите число: ");
			
			do {
				secondPlayer.setNumber(scan.nextInt());
				if(firstPlayer.getNumber() == secondPlayer.getNumber()) {
					System.out.println("Игрок " + secondPlayer.getName() + ", введите другое число, " + 
						"несовпадающее с числом первого игрока: ");

				}
			} while(firstPlayer.getNumber() == secondPlayer.getNumber());

			if(randomNumber == firstPlayer.getNumber()) {
				System.out.println("Игрок " + firstPlayer.getName() + ", вы выиграли!");
			} else if(randomNumber == secondPlayer.getNumber()) {
				System.out.println("Игрок " + secondPlayer.getName() + ", вы выиграли!");
			} else {
				System.out.println("Вы оба проиграли! Число: " + randomNumber);
			}
			
			do {
				System.out.println("Хотите продолжить? [yes/no]: ");
				resumeAnswer = scan.next();
			} while(!resumeAnswer.equals("yes") && !resumeAnswer.equals("no"));
		}
	}
}