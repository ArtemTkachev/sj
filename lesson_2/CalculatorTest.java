import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		String answer = "yes";
		boolean correctSign;

		while(answer.equals("yes")) {
			System.out.println("Введите первое число: ");
			int firstNum = scan.nextInt();
			do {
				System.out.println("Введите знак математической операции [+/-/*///%/^]: ");
				if(!calc.setSignOper(scan.next().charAt(0))) {
					System.out.println("Знак математической операции некорректен!");
					correctSign = false;
				} else {
					correctSign = true;
				}
			} while(!correctSign);
			//char signOper = scan.next().charAt(0);
			System.out.println("Введите второе число: ");
			int secondNum = scan.nextInt();

			float result = calc.calculate((float)firstNum, (float)secondNum, calc.getSignOper());
			//if(result != -1) {
			System.out.println("Результат вычисления: " + result);
			//}

			do {
				System.out.println("Хотите продолжить? [yes/no]: ");
				answer = scan.next();
			} while(!answer.equals("yes") && !answer.equals("no"));
		}
	}
}