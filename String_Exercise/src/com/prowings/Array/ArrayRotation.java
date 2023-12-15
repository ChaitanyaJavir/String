package com.prowings.Array;

import java.util.Arrays;

public class ArrayRotation {
	public static int[] rotateLeft(int[] array, int positions) {
		int length = array.length;
		int[] rotatedArray = new int[length];

		for (int i = 0; i < length; i++) {
			int newPosition = (i - positions + length) % length;
			rotatedArray[newPosition] = array[i];

		}

		return rotatedArray;

	}

	public static void main(String[] args) {
		int[] originalArray = { 5, 6, 7, 8, 9 };

		int[] rotatedLeft = rotateLeft(originalArray, 2);
		System.out.println("Array Rotated: " + Arrays.toString(rotatedLeft));
	}
				
}
