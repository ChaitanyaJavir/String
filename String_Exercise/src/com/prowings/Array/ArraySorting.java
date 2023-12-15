package com.prowings.Array;

import java.util.Arrays;

public class ArraySorting {
		public static void main(String[] args) {
			
			int[] array = {2,5,4,3,1};
			Arrays.sort(array);
			
			System.out.println("Sorting of Array: " + Arrays.toString(array));
			
			int index = Arrays.binarySearch(array, 4);
			System.out.println("Binaray of array: " +index);
		}
}
