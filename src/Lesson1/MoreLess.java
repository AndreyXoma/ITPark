package Lesson1;

import java.util.Scanner;

/**
 * Сравнение двух чисел
 */
public class MoreLess {
    public static void more() {
        try {
            System.out.println("Введи два числа для сравнения:");
            Scanner console = new Scanner(System.in);
            int num = console.nextInt();
            int numTwo = console.nextInt();
            if (num > numTwo) {
                System.out.println(">");
            } else if (num < numTwo) {
                System.out.println("<");
            } else {
                System.out.println("=");
            }
        } catch (Exception e) {
            System.out.println("Введи число");
        }
    }
}
