public class Calculator {

	private char signOper;

	public char getSignOper() {
		return signOper;
	}

	public boolean setSignOper(char signOper) {
		if(signOper == '+' || signOper == '-' || signOper == '*' || 
			signOper == '/' || signOper == '%' || signOper == '^') {
			this.signOper = signOper;
			return true;
		}
		return false;
	}
	
	public float calculate(float firstNum, float secondNum, char signOper) {
		float result = 0f;
		switch(signOper) {
			case '+': 
				result = firstNum + secondNum;
				break;
			case '-': 
				result = firstNum - secondNum;
				break;
			case '*':
				result = firstNum * secondNum;
				break;
			case '/':
				result = firstNum / secondNum;
				break;
			case '%':
				result = firstNum % secondNum;
				break;
			case '^':
				result = 1f;
				for(int i = 0; i < secondNum; i++) {
					result *= firstNum;
				}
				break;
			default: 
			/*
				System.out.println("Знак математической операции некорректен!");
				result = -1.5f;
			*/
				break;
		}
		return result;
	}
}