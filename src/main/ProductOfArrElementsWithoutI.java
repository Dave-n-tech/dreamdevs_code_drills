package main;

import java.util.Arrays;

public class ProductOfArrElementsWithoutI {
    static void main() {
        int[] inputArr = {2, 1, 5, 6};

        int[] productArr = productExceptI(inputArr);
        System.out.println(Arrays.toString(productArr));

    }

    public static int[] productExceptI(int[] arr) {
        int n = arr.length;

        int[] r = new int[arr.length];
        Arrays.fill(r, 1);

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if (i != j) r[i] *= arr[j];
            }
        }

        return r;
    }


}
