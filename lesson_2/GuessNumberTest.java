import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите имя первого игрока: ");
		Player firstPlayer = new Player(scan.nextLine());
		System.out.println("Введите имя второго игрока: ");
		Player secondPlayer = new Player(scan.nextLine());
		GuessNumber guessNumber = new GuessNumber(firstPlayer, secondPlayer);
		guessNumber.game(scan);
	}
}