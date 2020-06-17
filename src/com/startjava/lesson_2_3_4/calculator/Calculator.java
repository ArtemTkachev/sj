package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int firstNum;
    private int secondNum;
    private char signOper;
    private final char[] signs = {'+', '-', '*', '/', '%', '^'};

    public char getSign(int ind) {
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
        if (signOper == getSign(0)) {
            return Math.addExact(firstNum, secondNum);
        } else if (signOper == getSign(1)) {
            return Math.subtractExact(firstNum, secondNum);
        } else if (signOper == getSign(2)) {
            return Math.multiplyExact(firstNum, secondNum);
        } else if (signOper == getSign(3)) {
            return (double) firstNum / (double) secondNum;
        } else if (signOper == getSign(4)) {
            return firstNum % secondNum;
        } else if (signOper == getSign(5)) {
            return Math.pow(firstNum, secondNum);
        }
        return 0;
    }
}