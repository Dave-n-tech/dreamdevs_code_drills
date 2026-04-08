package main;

public class MagicSquare {
    static void main(String[] args) {
        int[][] input = {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 2}
        };
        int sum = 15;
        System.out.println(allSumDirectionsEqualsSum(input, sum));
    }

    public static boolean allSumDirectionsEqualsSum (int[][] arr, int sum) {
        int n = arr.length;
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;

        for (int i = 0; i < n; i++){
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += arr[i][j];
                colSum += arr[j][i];
            }

            if (rowSum != sum || colSum != sum) return false;

            leftDiagonalSum += arr[i][i];
            rightDiagonalSum += arr[i][n - 1 - i];
        }

        return leftDiagonalSum == sum && rightDiagonalSum == sum;
    }
}
