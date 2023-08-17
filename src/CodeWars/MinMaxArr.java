package CodeWars;

import java.util.Arrays;

public class MinMaxArr {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        System.out.println(Arrays.toString(getMinAndMax(arr1, arr2)));


    }

    private static int[] getMinAndMax(int[] arr, int[] arr2) {

        int[] arrray = new int[2];
        arrray[0] = Arrays.stream(arr2).max().getAsInt() - Arrays.stream(arr).min().getAsInt();
        int maxElementArr = Arrays.stream(arr).max().getAsInt();
        int res = maxElementArr - Arrays.stream(arr2).min().getAsInt() ;
        for(int i = 0; i < arr2.length; i++) {
            int num = maxElementArr - arr2[i];
            if(num > res || num <= -1) {continue;}
            else {res = num;}
        }
        if(res < 0) res *= -1;
        arrray[1] = res;
        return arrray;
    }
}
