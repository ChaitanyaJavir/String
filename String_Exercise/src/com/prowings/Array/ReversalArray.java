package com.prowings.Array;

import java.util.Arrays;

public class ReversalArray{

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        System.out.println(" Array: " + Arrays.toString(array));

        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }

        System.out.println("Reversed Array: " + Arrays.toString(array));
    }
}
