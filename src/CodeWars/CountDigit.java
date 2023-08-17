package CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CountDigit {
    public static void main(String[] args) {
        System.out.println(nbDig(11011, 2));


    }

    public static int nbDig(int n, int d) {
        // your code
//        int count = 0;
//        for (int i = 0; i <= n; i++) {
//            int num = i * i;
//            if(num == 0 && d == 0) {
//                count++;
//                continue;
//            }
//            while (num > 0) {
//                if (num % 10 == d) {
//                    count++;
//                }
//                num /= 10;
//            }
//        }
//        return count;

        return (int) IntStream.rangeClosed(0, n)
                .map(i -> i * i)
                .mapToObj(String::valueOf)
                .flatMap(s -> Stream.of(s.split("")))
                .filter(s -> s.equals(String.valueOf(d)))
                .count();
    }

}
