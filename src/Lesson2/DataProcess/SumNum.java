package Lesson2.DataProcess;

import java.util.Arrays;
import java.util.Random;

/**
 * Даны числа
 * Определить их сумму.
 */
public class SumNum {
    public static void main(String[] args) {
        Random random = new Random();
        byte[] arr = new byte[10];
        random.nextBytes(arr);
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Сумма всех чисел массива: " + sum);
    }
}
