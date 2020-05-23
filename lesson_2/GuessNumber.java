import java.util.Scanner;

public class GuessNumber {
	private Player firstPlayer;
	private Player secondPlayer;

	public GuessNumber(Player firstPlayer, Player secondPlayer) {
		this.firstPlayer = firstPlayer;
		this.secondPlayer = secondPlayer;
	}

	public void play() {
		Scanner scan = new Scanner(System.in);
		int randomNumber = (int) (Math.random() * 101);
		int secondNum;
		//	System.out.println(randomNumber);
		System.out.println("Компьютер загадал число от 0 до 100. У вас 10 попыток, чтобы отгадать его.");

		for(int i = 1; i <= 10; i++) {
			System.out.println("Попытка №" + i);
			System.out.println("Игрок " + firstPlayer.getName() + ", введите число: ");
			firstPlayer.setNumber(scan.nextInt());
			System.out.println("Игрок " + secondPlayer.getName() + ", введите число: ");

			do {
				secondNum = scan.nextInt();
				if(firstPlayer.getNumber() == secondNum) {
					System.out.println("Игрок " + secondPlayer.getName() + ", введите другое число, " + 
						"несовпадающее с числом первого игрока: ");
				}
			} while(firstPlayer.getNumber() == secondNum);
			secondPlayer.setNumber(secondNum);
			
			if(randomNumber == firstPlayer.getNumber()) {
				System.out.println("Игрок " + firstPlayer.getName() + ", вы выиграли!");
				break;
			} else if(randomNumber == secondPlayer.getNumber()) {
				System.out.println("Игрок " + secondPlayer.getName() + ", вы выиграли!");
				break;
			} else if(i == 10) {
				System.out.println("Вы оба проиграли! Число: " + randomNumber);
				break;
			}
		}
	}
}