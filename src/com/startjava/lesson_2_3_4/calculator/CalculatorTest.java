package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        String answer = "yes";
        boolean correctSign = false;
        String srcMathExpres;
        String[] SplitMathExpres;

        while (answer.equals("yes")) {
            do {
                System.out.print("Введите математическое выражение: ");
                srcMathExpres = scan.nextLine();
                SplitMathExpres = srcMathExpres.split(" ");

                calc.setFirstNum(Integer.parseInt(SplitMathExpres[0]));
                calc.setSecondNum(Integer.parseInt(SplitMathExpres[2]));

                if (!calc.setSignOper(SplitMathExpres[1].charAt(0))) {
                    System.out.println("Знак математической операции некорректен!");
                } else {
                    break;
                }
            } while (!correctSign);


            double result = calc.calculate();

            System.out.println("Результат вычисления: " + result);

            do {
                System.out.print("Хотите продолжить? [yes/no]: ");
                answer = scan.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        }
    }
}