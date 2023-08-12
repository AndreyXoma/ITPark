package Lesson1;

import java.util.Scanner;

/**
 * Определить индекс массы тела
 */
public class MassIndex {
    public static void massIndex() {
        try {
            Scanner console = new Scanner(System.in);
            System.out.println("Введите ваш вес в килограммах:");
            double weight = console.nextDouble();
            System.out.println("Введите ваш рост в сантиметрах:");
            double height = console.nextDouble();
            System.out.println("Индекс массы вашего тела: " + getIndex(weight, height));
        } catch (Exception e) {
            System.out.println("Введи все данные в числах!");
        }

    }

    private static String getIndex(double weight, double height) {
        double bmi = weight / Math.pow(height, 2);
        if (bmi <= 18.5) {
            return "Недовес";
        } else if (bmi <= 25.0) {
            return "Все в норме";
        } else if (bmi <= 30.0) {
            return "Лишний вес";
        } else {
            return "Ожирение";
        }

    }
}
