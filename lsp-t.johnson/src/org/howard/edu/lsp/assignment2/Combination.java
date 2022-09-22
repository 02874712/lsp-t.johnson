package org.howard.edu.lsp.assignment2;
import java.util.ArrayList;

public class Combination {

	public ArrayList<String> calculateCombinations(int[] array, int total_sum){
		ArrayList<String> combo_arr = new ArrayList<String>();
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] == total_sum) {
				combo_arr.add("[" + i + "]");
			}
			for(int j = 1; j < array.length; j++) {
				if(array[i] + array[j] == total_sum && i != j) {
					combo_arr.add("[" + i + "," + j + "]");
				}
			}
		}
		return combo_arr;
	}

}
