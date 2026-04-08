package main;

public class IntegerDivision {
    static void main(String[] args) {
        System.out.println(divide(6, 3));
        System.out.println(divide(5, 3));
        System.out.println(divide(10, 5));
        System.out.println(divide(-15, 5));
    }

    public static int divide(int number, int divisor){
        // constraints:
        // don't use "/"
        // divisor can't be less than 1
        // return integer division of number and divisor

        if (divisor < 1){
            throw new IllegalArgumentException("Divisor can't be less than 1.");
        }

        if(number == 0) return 0;

        int quotient = 0;
        int count = 0;

        if (number >= 0){
            for (int i = 0; i <= number; i++){
                if (count == divisor){
                    quotient++;
                    count = 0;
                }
                count++;
            }
        }else {
            for (int i = number; i <= number; i++){
                if (count == divisor){
                    quotient--;
                    count = 0;
                }
                count++;
            }
        }

        return quotient;

    }
}
