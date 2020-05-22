public class Calculator {

	private int firstNum;
	private int secondNum;
	private char signOper;

	public int getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

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
	
	public float calculate() {
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
		}
		return result;
	}
}