package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int firstNum;
    private int secondNum;
    private char signOper;
    private final char[] signs = {'+', '-', '*', '/', '%', '^'};

    public char getSignsElementsByIndex(int ind) {
        return signs[ind];
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public boolean setSignOper(char signOper) {
        for (char sign : signs) {
            if (sign == signOper) {
                this.signOper = signOper;
                return true;
            }
        }
        return false;
    }

    public double calculate() {
        double result = 0;

        if (signOper == getSignsElementsByIndex(0)) {
            result = Math.addExact(firstNum, secondNum);
        } else if (signOper == getSignsElementsByIndex(1)) {
            result = Math.subtractExact(firstNum, secondNum);
        } else if (signOper == getSignsElementsByIndex(2)) {
            result = Math.multiplyExact(firstNum, secondNum);
        } else if (signOper == getSignsElementsByIndex(3)) {
            result = (double) firstNum / (double) secondNum;
        } else if (signOper == getSignsElementsByIndex(4)) {
            result = firstNum % secondNum;
        } else if (signOper == getSignsElementsByIndex(5)) {
            result = Math.pow(firstNum, secondNum);
        }

        return result;
    }
}