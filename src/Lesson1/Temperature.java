package Lesson1;

import java.util.Scanner;

/**
 * Преобразование температуры
 */
public class Temperature {
    private static final Scanner console = new Scanner(System.in);

    public static void temp() {
        try {
            System.out.println("Введите температуру по шкале Цельсия:");
            double temp = console.nextDouble();
            getTemp(temp);
        } catch (Exception e) {
            System.out.println("Введите число!");
        }
    }

    private static double getTemp(double temp) {
        try {
            double result = 0;
            System.out.println("По какой шкале вы хотите получить температуру:\n" +
                    "1. Фаренгейта\n" +
                    "2. Кельвина");
            int num = console.nextInt();
            switch (num) {
                case 1:
                    result = (temp * 1.8) + 32;
                    System.out.println("Температура по шкале Фаренгейта: " + result);
                    break;
                case 2:
                    result = temp + 273.15;
                    System.out.println("Температура по шкале Кельвина: " + result);
                    break;
                default:
                    System.out.println("Есть только 1 или 2 шкала!");
            }
            return result;
        } catch (Exception e) {
            System.out.println("Введи число, чтобы выбрать шкалу!!");
            return 0;
        }
    }
}
