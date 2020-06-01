package com.startjava.lesson_2_3.calculator;

import java.util.Arrays;

public class Calculator {

	private int firstNum;
	private int secondNum;
	private char signOper;
	private char[] signs = {'+', '-', '*', '/', '%', '^'};
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public boolean setSignOper(char signOper) {
		for(char sign : this.signs) {
			if(sign == signOper) {
				this.signOper = signOper;
				return true;
			}
		}
		return false;
	}
	
	public double calculate() {
		double result = 0;

		if(signOper == signs[0]) {
			result = Math.addExact(firstNum, secondNum);
		} else if(signOper == signs[1]) {
			result = Math.subtractExact(firstNum, secondNum);
		} else if(signOper == signs[2]) {
			result = Math.multiplyExact(firstNum, secondNum);
		} else if(signOper == signs[3]) {
			result = (double)firstNum / (double)secondNum;
		} else if(signOper == signs[4]) {
			result = firstNum % secondNum;
		} else if(signOper == signs[5]) {
			result = Math.pow(firstNum, secondNum);
		}

//		switch(signOper) {
//			case '+':
//				result = Math.addExact(firstNum, secondNum);
//				break;
//			case '-':
//				result = Math.subtractExact(firstNum, secondNum);
//				break;
//			case '*':
//				result = Math.multiplyExact(firstNum, secondNum);
//				break;
//			case '/':
//				result = firstNum / secondNum;
//				break;
//			case '%':
//				result = firstNum % secondNum;
//				break;
//			case '^':
//				result = Math.pow(firstNum, secondNum);
//				break;
//			default:
//				break;
//		}

		return result;
	}
}