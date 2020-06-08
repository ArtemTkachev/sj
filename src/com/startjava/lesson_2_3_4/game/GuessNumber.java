package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player firstPlayer;
    private Player secondPlayer;
    private int countNum;

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void play() {
        Scanner scan = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 101);
        int firstNum, secondNum;
        System.out.println(randomNumber);
        System.out.println("Компьютер загадал число от 0 до 100. У вас 10 попыток, чтобы отгадать его.");

        firstPlayer.setEmptyValues(countNum);
        secondPlayer.setEmptyValues(countNum);

        for (int i = 0; i < 10; i++) {
            countNum = i + 1;
            System.out.println("Попытка №" + (countNum));
            System.out.println("Игрок " + firstPlayer.getName() + ", введите число: ");
            firstNum = scan.nextInt();
            firstPlayer.setNumber(i, firstNum);
            System.out.println("Игрок " + secondPlayer.getName() + ", введите число: ");
            secondNum = controlSecNum(firstNum, scan);
            secondPlayer.setNumber(i, secondNum);

            if (randomNumber == firstNum) {
                outResultWin(firstPlayer.getName(), countNum);
                break;
            } else if (randomNumber == secondNum) {
                outResultWin(secondPlayer.getName(), countNum);
                break;
            } else if (i == 9) {
                System.out.println("У вас закончились попытки! Число: " + randomNumber);
                break;
            }
        }
        outResult(countNum);
    }

    private void outResultWin(String player, int attempt) {
        System.out.println("Игрок " + player + ", вы угадали число c " + attempt + " попытки!");
    }

    private int controlSecNum(int firstNum, Scanner scan) {
        int secondNum;
        do {
            secondNum = scan.nextInt();
            if (firstNum == secondNum) {
                System.out.println("Игрок " + secondPlayer.getName() + ", введите другое число, " +
                        "несовпадающее с числом первого игрока: ");
            }
        } while (firstNum == secondNum);
        return secondNum;
    }

    private void outResult(int countNum) {
        System.out.println("Первый игрок ввел следующие числа: " + Arrays.toString(firstPlayer.getNumbers(countNum)) +
                            "\nВторой игрок ввел следующие числа: " + Arrays.toString(secondPlayer.getNumbers(countNum)));
    }

}