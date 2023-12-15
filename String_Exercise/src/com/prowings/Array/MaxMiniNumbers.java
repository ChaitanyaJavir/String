package com.prowings.Array;

public class MaxMiniNumbers 
{
	public static void main(String[] args) {
		 int [] numbers = {1,2,3,4,5};
		 
		 printMaxNumber(numbers);
		 printMinNumber(numbers);
	}
	
	public static void printMaxNumber(int[]numbers)
	{
		int max = numbers[0];
		
		for(int i = 1; i < numbers.length; i++)
		{
			if(numbers[i] > max)
			{
				max = numbers[i];
				
			}
		}
		System.out.println("Maximum Numbers: " + max);
	}
	
	public static void printMinNumber(int[]numbers)
	{
		int min = numbers[0];
		
		for(int i = 1; i < numbers.length; i++)
		{
			if(numbers[i] < min)
			{
				min = numbers[i];
			}
		}
		
		System.out.println("Minimum Numbers: " + min);
	}
	
	
}
	
