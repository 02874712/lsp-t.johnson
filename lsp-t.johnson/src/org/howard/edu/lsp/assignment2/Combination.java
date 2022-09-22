package org.howard.edu.lsp.assignment2;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * September 22, 2022
 * @02874712
 * @Tashiana Johnson
 */

public class Combination {
	/**
	 * 
	 * @param array - set of primitive integers
	 * @param total_sum - int sum 
	 * @return
	 */
	public ArrayList<String> calculateCombinations(int[] array, int total_sum){

		ArrayList<String> combo_arr = new ArrayList<String>();
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == total_sum) {
				combo_arr.add("[" + i + "]");
			}
			for(int j = 1; j < array.length; j++) {
				if(array[i] + array[j] == total_sum && i != j) {
					if(array[j] + array[i] == total_sum)
						{System.out.print("Duplicate! ");}
					else {
						combo_arr.add("[" + i + "," + j + "]");
						}
		
					}
			}
		}
		return combo_arr;

	}
	
}
																																																																														