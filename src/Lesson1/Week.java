package Lesson1;

import java.util.Scanner;

/**
 * Кол-во недель из введенных дней
 */
public class Week {
    private static final Scanner console = new Scanner(System.in);

    public static void getWeek() {
        try {
            System.out.println("Введи кол-во дней:");
            int day = console.nextInt();
            System.out.println("Кол-во недель: " + (day / 7));
        } catch (Exception e) {
            System.out.println("Введи число!!");
        }
    }
}
