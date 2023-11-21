package com.prowings.Excercise;

public class vowels 
{
	public static void main(String[] args) {
		
		String s1 = "chaitanya";
		s1 = s1.toLowerCase();
		
		vowlesConsonat(s1);
		
	}

	private static void vowlesConsonat(String s1) 
	{
		int vowlecount = 0;
		int consonantcount = 0;
		
		for(int i =0; i<s1.length();++i)
		{
			char s2 = s1.charAt(i);
		
		if( s2 >='a' && s2<='z')
		{
			if(s2=='a' || s2=='e'||s2=='i'||s2=='o'||s2=='u')
			{
				vowlecount++;
			}
			else
				consonantcount++;
		}
		}
		System.out.println("Vowels in given String:"+vowlecount);
		System.out.println("Consonant in given String:"+consonantcount);
	}

	}
