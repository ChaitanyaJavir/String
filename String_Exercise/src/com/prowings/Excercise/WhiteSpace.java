package com.prowings.Excercise;

public class WhiteSpace 
{
	public static void main(String[] args) {
		
		String name = "Hello , World";
		String result = removeWhiteSpace(name);
		
		System.out.println("Original name: " +name);
		System.out.println("Name after removing white space: " +result);
	}

	private static String removeWhiteSpace(String name) {
		
		return name.replaceAll("\\s", "");
	}

}
