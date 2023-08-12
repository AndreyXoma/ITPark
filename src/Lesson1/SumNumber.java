package Lesson1;

import java.util.Scanner;

/**
 * Сумма двух введенных чисел
 */
public class SumNumber {
    public static void sum() {
        try {
            System.out.println("Введи два числа для сложения:");
            Scanner console = new Scanner(System.in);
            int num = console.nextInt();
            int numTwo = console.nextInt();
            System.out.println("Сумма введенных тобой чисел: " + (num + numTwo));
        } catch (Exception e) {
            System.out.println("Введи число");
        }
    }
}
