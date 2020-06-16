package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player firstPlayer;
    private Player secondPlayer;
    private Scanner scan = new Scanner(System.in);

    public GuessNumber(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public void play() {
        int randomNumber = (int) (Math.random() * 101);
        int firstNum, secondNum;
        System.out.println(randomNumber);
        System.out.println("Компьютер загадал число от 0 до 100. У вас 10 попыток, чтобы отгадать его.");

        for (int i = 0; i < 10; i++) {
            System.out.println("Попытка №" + (i + 1));
            inputNumber(firstPlayer, i);
            checkNumRepeat(i);

           if (getMatchNumsResult(randomNumber, firstPlayer, i) ||
                   getMatchNumsResult(randomNumber, secondPlayer, i) ||
                        i == 9) {
               if (i == 9) {
                   System.out.println("У вас закончились попытки! Число: " + randomNumber);
               }
               showAttempts(i + 1, firstPlayer);
               showAttempts(i + 1, secondPlayer);
               firstPlayer.clear(i + 1);
               secondPlayer.clear(i + 1);
               break;
           }
        }
    }

    private void inputNumber(Player player, int index) {
        System.out.println("Игрок " + player.getName() + ", введите число: ");
        player.setNumber(index, scan.nextInt());
    }

    private void checkNumRepeat(int index) {
        do {
            inputNumber(secondPlayer, index);
            if (firstPlayer.getNumber(index) == secondPlayer.getNumber(index)) {
                System.out.println("Введенное число совпадает с числом первого игрока.");
            }
        } while (firstPlayer.getNumber(index) == secondPlayer.getNumber(index));
    }

    private boolean getMatchNumsResult(int randomNum, Player player, int index) {
        boolean playerWinResult = false;
        if (randomNum == player.getNumber(index)) {
            System.out.println("Игрок " + player.getName() + ", вы угадали число c " + (index + 1) + " попытки!");
            playerWinResult = true;
        }
        return playerWinResult;
    }

    private void showAttempts(int countNum, Player player) {
            System.out.println("Игрок " + player.getName() + " ввел следующие числа: " + Arrays.toString(player.getNumbers(countNum)));
    }

}