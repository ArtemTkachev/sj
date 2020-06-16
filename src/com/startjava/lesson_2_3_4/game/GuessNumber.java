package com.startjava.lesson_2_3_4.game;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private Player firstPlayer;
    private Player secondPlayer;

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

        for (int i = 0; i < 10; i++) {
            System.out.println("Попытка №" + (i + 1));
            firstNum = InputNumber(firstPlayer.getName(), scan);
            firstPlayer.setNumber(i, firstNum);
            secondNum = controlSecNum(firstNum, scan);
            secondPlayer.setNumber(i, secondNum);

           if (outResultPlayer(randomNumber, firstNum, secondNum, i + 1)) {
               showAttempts(i + 1, firstPlayer);
               showAttempts(i + 1, secondPlayer);
               firstPlayer.clear(i + 1);
               secondPlayer.clear(i + 1);
               break;
           }
        }
    }

    private int InputNumber(String playerName, Scanner scan) {
        System.out.println("Игрок " + playerName + ", введите число: ");
        return scan.nextInt();
    }

    private int controlSecNum(int firstNum, Scanner scan) {
        int secondNum;
        do {
            secondNum = InputNumber(secondPlayer.getName(), scan);
            if (firstNum == secondNum) {
                System.out.println("Введенное число совпадает с числом первого игрока.");
            }
        } while (firstNum == secondNum);
        return secondNum;
    }

    private boolean outResultPlayer(int randomNum, int firstPlayerNum, int secondPlayerNum, int attempt) {
        boolean outResult = true;
        boolean playerWinResult = true;
        Player winPlayer = null;
        if (randomNum == firstPlayerNum) {
            winPlayer = firstPlayer;
        } else if (randomNum == secondPlayerNum) {
            winPlayer = secondPlayer;
        } else if (attempt == 10) {
            System.out.println("У вас закончились попытки! Число: " + randomNum);
            playerWinResult = false;
        } else {
            outResult = false;
            playerWinResult = false;
        }
        if (playerWinResult) {
            outResultWin(winPlayer, attempt);
        }
        return outResult;
    }

    private void outResultWin(Player player, int attempt) {
        System.out.println("Игрок " + player.getName() + ", вы угадали число c " + attempt + " попытки!");
    }

    private void showAttempts(int countNum, Player player) {
            System.out.println("Игрок " + player.getName() + " ввел следующие числа: " + Arrays.toString(player.getNumbers(countNum)));
    }

}