import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		String answer = "yes";
		boolean correctSign = false;

		while(answer.equals("yes")) {
			System.out.println("Введите первое число: ");
			calc.setFirstNum(scan.nextInt());
			do {
				System.out.println("Введите знак математической операции [+/-/*///%/^]: ");
				if(!calc.setSignOper(scan.next().charAt(0))) {
					System.out.println("Знак математической операции некорректен!");
					//correctSign = false;
				} else {
					break;
					//correctSign = true;
				}
			} while(!correctSign);
			//char signOper = scan.next().charAt(0);
			System.out.println("Введите второе число: ");
			calc.setSecondNum(scan.nextInt());

			float result = calc.calculate();
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