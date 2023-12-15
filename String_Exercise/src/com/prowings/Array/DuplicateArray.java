package com.prowings.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateArray 
{
	public static void main(String[] args) {
		int[] array = {1,2,4,5,1,2,4};
		
		List<Integer> duplicateElement = findDuplicate(array);
		System.err.println("Duplicate Elements: " + duplicateElement);
	}

	public static List<Integer> findDuplicate(int[] array) {
		
		List<Integer> duplicates = new ArrayList();
        Set<Integer> uniqueElements = new HashSet();
        
        for(int element : array) {
        	if(!uniqueElements.add(element))
        	{
        		duplicates.add(element);
        	}
        }
		
		return duplicates;
	}

}
