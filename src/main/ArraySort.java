package main;

import java.util.Arrays;

public class ArraySort {
    static void main(String[] args) {
        int[] input = new int[]{20, 12, 4, 8, 2};

        int[] result = sortArray(input);
        System.out.println(Arrays.toString(result));

    }

    public static int[] sortArray(int[] arr) {

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    arr[j] += arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] -= arr[j + 1];
                }
            }
        }

        return arr;
    }

}
