public class Calculator {

	/*
	private char signOper;

	public char getSignOper() {
		return signOper;
	}

	public void setSignOper(char signOper) {
		this.signOper = signOper;
	}
	*/

	public float resultOper(float firstNum, float secondNum, char signOper) {
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
				result = -1f;
				break;
		}
		return result;
	}
}