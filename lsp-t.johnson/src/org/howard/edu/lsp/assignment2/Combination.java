package org.howard.edu.lsp.assignment2;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * September 22, 2022
 * @02874712
 * @Author Tashiana Johnson 
 * @Class Combination - creates a obj Combination that determines a set of combinations with any given sum
 * 
 * 
 */

public class Combination {
	/**
	 * 
	 * @param array - set of primitive integers in a given array 
	 * @param total_sum - sum of two given integers if given by array 
	 * @return string ArrayList where it contains indexes of array values that equals to the total_sum
	 */
	public ArrayList<String> calculateCombinations(int[] array, int total_sum){

		ArrayList<String> combo_arr = new ArrayList<String>();
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == total_sum) {
				combo_arr.add("[" + i + "]");
			}
			for(int j = 1; j < array.length; j++) {
				if(array[i] + array[j] == total_sum && i != j) {
	//				combo_arr.add("[" + i + "," + j + "]");
					String set = "[" + j + "," + i + "]";
					Boolean setExistsBool = combo_arr.contains(set);					//bool to find if duplicates exists in ArrayList
					if (setExistsBool == false) { 
						combo_arr.add("[" + i + "," + j + "]");
					}
					}
					}
			}		
		return combo_arr;

		}
	}
	


																																																																														