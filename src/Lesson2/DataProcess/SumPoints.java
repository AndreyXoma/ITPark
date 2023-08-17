package Lesson2.DataProcess;

import java.util.Scanner;
/**
 * Известны оценки абитуриента на четырех экзаменах. Определить сумму набранных им баллов.
 */
public class SumPoints {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        while (count < 5) {
            System.out.println("Введите оценку за " + count + " экзамен:");
            if (console.hasNextInt()) {
                int point = console.nextInt();
                if (point >= 2 && point <= 5) {
                    sum += point;
                    count++;
                } else {
                    System.out.println("Диапозон оценок: 2-5");
                }
            } else {
                System.out.println("Ошибка: ожидался ввод числа!");
                return;
            }
        }
        System.out.println("Сумма набранных баллов: " + sum);
    }
}
