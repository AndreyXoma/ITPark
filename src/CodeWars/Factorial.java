package CodeWars;

import java.util.Arrays;




public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(112));


    }

    public static String factorial(int n) {
        int[] result = new int[100000]; // Массив, в котором будет храниться результат
        result[0] = 1;
        int size = 1;

        for (int i = 2; i <= n; i++) {
            size = multiply(i, result, size);
        }

        StringBuilder factorial = new StringBuilder();
        for (int i = size - 1; i >= 0; i--) {
            factorial.append(result[i]);
        }

        return factorial.toString();
    }

    public static int multiply(int x, int[] result, int size) {
        int carry = 0;

        for (int i = 0; i < size; i++) {
            int product = result[i] * x + carry;
            result[i] = product % 10;
            carry = product / 10;
        }

        while (carry != 0) {
            result[size] = carry % 10;
            carry = carry / 10;
            size++;
        }

        return size;
    }



}
