package com.prowings.Excercise;

public class Reverse 
{
	public static void main(String[] args) {
		
		StringBuffer original = new StringBuffer ("Hello");
		System.out.println("original: "+original);
		
		///reverse character
		System.out.println("reverser the charecter");
		original.reverse();
		System.out.println("reversed: " +original);
	}

}
 