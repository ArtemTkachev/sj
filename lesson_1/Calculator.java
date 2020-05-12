public class Calculator {
	public static void main(String[] args) {
		float firstNum = 8;
		float secondNum = 3;
		float result = 0;
		char oper = '^';
		if (oper == '+') {
			result = firstNum + secondNum;
		}
		if (oper == '-') {
			result = firstNum - secondNum;
		}
		if (oper == '/') {
			if (secondNum != 0) {
				result = firstNum / secondNum;
			} else {
				System.out.println("You can't divide by zero!");
			}
		}
		if (oper == '*') {
			result = firstNum * secondNum;
		}
		if (oper == '%') {
			if (secondNum != 0) {
				result = firstNum % secondNum;
			} else {
				System.out.println("You can't divide by zero!");
			}
		}
		if (oper == '^') {
			if (firstNum != 0) {
				result = 1;
			} 
			for(int i = 0; i < secondNum; i++) {
				result = result * firstNum;
			}
		}
		System.out.println("result: " + result);
	}
}