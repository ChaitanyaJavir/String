package com.prowings.Excercise;

public class Palindrome 
{	
	public static void main(String[] args) {
		
		String name = "refer";
		
		if(isPalindrome(name))
		{
			System.out.println(name + " is a palindrome.");
		}
		else
		{
			System.out.println(name + " is not a palindrome.");
		}
		
	}

	private static boolean isPalindrome(String name) {
		StringBuffer sb = new StringBuffer(name);
		String reversed = sb.reverse().toString();
		
		if(name.equals(reversed))
		{
			return true;
		}
		else
			return false;
	}

}
