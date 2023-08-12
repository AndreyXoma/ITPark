package Lesson1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Учитывая список цифр, верните наименьшее число, которое могло
 * быть сформировано из этих цифр, используя цифры только один раз
 */
public class Minimum {
    private static final Scanner console = new Scanner(System.in);

    public static void getMinNumber() {
        int[] arr = new int[10];
        System.out.println("Введите 10 любых чисел: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = console.nextInt();
        }
        System.out.println("Минимально собранное число из введенных: " + minValue(arr));

    }

    private static int minValue(int[] values) {

        Arrays.sort(values);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < values.length; i++) {
            set.add(values[i]);
        }
        StringBuilder s = new StringBuilder();
        for (int i : set) {
            s.append(i);
        }
        return Integer.parseInt(s.toString());

    }
}
