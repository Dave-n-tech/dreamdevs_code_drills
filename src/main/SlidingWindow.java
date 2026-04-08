package main;

import java.util.Arrays;

public class SlidingWindow {
    public static void main(String[] args) {
        int [] arr = {1, 5, 6, 9, 3, 7};
        int k = 3;
        int[] output = findMaxSubarray(arr, k);

        System.out.println(Arrays.toString(output));
    }

    public static int[] findMaxSubarray(int[] input, int k) {
        if (input.length < k) {
            return new int[0];
        }

        int windowSum = 0;
        for (int i = 0; i < k; i++){
            windowSum += input[i];
        }

        int maxSum = windowSum;
        int startIndex = 0;

        for (int i = k; i < input.length; i++){
            windowSum = windowSum - input[i - 1];

            if (windowSum > maxSum) {
                maxSum = windowSum;
                startIndex = i;
            }

        }

        return Arrays.copyOfRange(input, startIndex, startIndex + k);
    }
}
