package Lesson1;

import java.util.Scanner;

/**
 * Определить сколько чисел в числе:
 * если 4 или 6 вернуть true иначе false
 */
public class CountNumber {
    public static void countNumber() {
        try {
            System.out.println("Введи число:");
            Scanner console = new Scanner(System.in);
            System.out.println(getCountNumber(console.nextInt()));
        } catch (Exception e) {
            System.out.println("Введи число, дурень!!");
        }
    }

    private static boolean getCountNumber(int num) {
        boolean res;
        int count = 0;
        do {
            count++;
            num /= 10;
        } while (num != 0);
        return res = (count == 4 || count == 6) ? true : false;

    }
}
