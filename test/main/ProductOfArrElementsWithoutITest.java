package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrElementsWithoutITest {

    @Test
    void productExceptI() {
        int[] inputArr = {2, 1, 5, 6};
        int[] expectedProductArr = {30, 60, 12, 10};
        int[] productArr = ProductOfArrElementsWithoutI.productExceptI(inputArr);

        assertArrayEquals(expectedProductArr, productArr);
    }

}