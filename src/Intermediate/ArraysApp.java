package Intermediate;

import java.util.Random;

public class ArraysApp {
    public static void main(String[] args) {
        int[] lotteryNumbers = new int[5];

        Random randomNum = new Random();

        lotteryNumbers[0] = randomNum.nextInt(90)+1; //原本為0~89，加1後變成1~90
        lotteryNumbers[1] = 23;
        lotteryNumbers[2] = 67;
        lotteryNumbers[3] = 37;
        lotteryNumbers[4] = 11;


        for (int lotteryNumber : lotteryNumbers){
            System.out.println(lotteryNumber);
        }
        System.out.println();

        int[][] weeklyLotteryNumbers = {
                {1, 2, 3, 4, 5},
                {10, 20, 30, 40, 50},
                {13, 24, 35, 46, 57},
                {10, 23, 35, 48, 58}
        };

        for (int i = 0; i < weeklyLotteryNumbers.length; i++) {
            for (int j = 0; j < weeklyLotteryNumbers[i].length; j++) {
                System.out.print(weeklyLotteryNumbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
