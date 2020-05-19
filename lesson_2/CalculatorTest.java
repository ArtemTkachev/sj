import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		String answer = "yes";

		while(answer.equals("yes")) {
			System.out.println("Введите первое число: ");
			int firstNum = scan.nextInt();
			System.out.println("Введите знак математической операции: ");
			char signOper = scan.next().charAt(0);
			System.out.println("Введите второе число: ");
			int secondNum = scan.nextInt();

			float result = calc.resultOper((float)firstNum, (float)secondNum, signOper);
			if(result == -1) {
				System.out.println("Знак математической операции некорректен!");
			} else {
				System.out.println("Результат вычисления: " + result);
			}

			do {
				System.out.println("Хотите продолжить? [yes/no]: ");
				answer = scan.next();
			} while(!answer.equals("yes") && !answer.equals("no"));
		}
	}
}