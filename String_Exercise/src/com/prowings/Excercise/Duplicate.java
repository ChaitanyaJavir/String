package com.prowings.Excercise;

public class Duplicate {
	public static void main(String[] args, int i) {

		String input = new String("AABCB");
		String output = new String();

		for (int i1 = 0; i1 < input.length(); i1++) {
			for (int j = 0; i1 < output.length(); j++) {
				if (input.charAt(i1) != output.charAt(j)) {
					output = output + input.charAt(j);
					{
						boolean ifDuplicate = true;
						break;
					}
				}
			}
		}
		boolean isDuplicate = false;
		if (!isDuplicate) {
			output = output + input.charAt(i);
		}

	}

}
