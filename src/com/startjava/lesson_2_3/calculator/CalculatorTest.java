package com.startjava.lesson_2_3.calculator;

import java.util.Arrays;
import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        String answer = "yes";
        boolean correctSign = false;
        String mathExpres = "";
        String[] mathExpresJoins = new String[3];

        while (answer.equals("yes")) {
            do {
                System.out.print("Введите математическое выражение: ");
				mathExpres = scan.nextLine();
				mathExpresJoins = mathExpres.split(" ");

                calc.setFirstNum(Integer.parseInt(mathExpresJoins[0]));
                calc.setSecondNum(Integer.parseInt(mathExpresJoins[2]));

                if(!calc.setSignOper(mathExpresJoins[1].charAt(0))) {
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