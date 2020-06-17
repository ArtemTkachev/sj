package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        String answer = "yes";
        boolean correctSign = false;
        String srcMathExp;
        String[] SplitMathExpres;

        while (answer.equals("yes")) {
            do {
                System.out.print("Введите математическое выражение: ");
                srcMathExp = scan.nextLine();
                SplitMathExpres = srcMathExp.split(" ");

                calc.setFirstNum(Integer.parseInt(SplitMathExpres[0]));
                calc.setSecondNum(Integer.parseInt(SplitMathExpres[2]));

                if (!calc.setSignOper(SplitMathExpres[1].charAt(0))) {
                    System.out.println("Знак математической операции некорректен!");
                } else {
                    break;
                }
            } while (!correctSign);

            System.out.println("Результат вычисления: " + calc.calculate());

            do {
                System.out.print("Хотите продолжить? [yes/no]: ");
                answer = scan.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }
    }
}