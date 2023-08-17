package CodeWars;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Определить кол-во делителей числа
 */
public class CountDivisors {
    private static final Scanner console = new Scanner(System.in);

    public static void getCount() {
        try {
            System.out.println("Введите ваше число:");
            int num = console.nextInt();
            System.out.println("Кол-во делителей вашего числа: " + numberOfDivisors(num));
        } catch (Exception e) {
            System.out.println("Введи число!!!");
        }

    }

    private static long numberOfDivisors(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
    }
}
