package org.howard.edu.lsp.assignment2;
import org.howard.edu.lsp.assignment2.Combination;
import java.util.ArrayList;


public class TestCombo {

	public static void main(String[] args) {
		System.out.println("Assignment 3 Loading ...\n");
		
		
		Combination combination = new Combination();
		
		//TEST CASE #1
		int[] test1 = {5, 5, 15, 10};
		int sum1 = 15;
		ArrayList<String> output1 = combination.calculateCombinations(test1, sum1);
		System.out.print(output1 + "\n\n");
		output1.clear();
		
	    // TEST CASE # 2
	    int[] test2 = {25, 25, 50, 75};
	    int sum2 = 75;
		ArrayList<String> output2 = combination.calculateCombinations(test2, sum2);
		System.out.print(output2 + "\n\n");
	    
	    // TEST CASE # 3
	    int[] test3 = {50, 30, 90, 50, 70, 100};
	    int sum3 = 100;
		ArrayList<String> output3 = combination.calculateCombinations(test3, sum3);
		System.out.print(output3 + "\n\n");

	    // TEST CASE # 4
	    int[] test4 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	    int sum4 = 12;
		ArrayList<String> output4 = combination.calculateCombinations(test4, sum4);
		System.out.print(output4 + "\n\n");

	    // TEST CASE FUNCTION CALLS
//	    combination.calculateCombinations(test1, sum1);
//	    combination.calculateCombinations(test2, sum2);
//	    combination.calculateCombinations(test3, sum3);
//	    combination.calculateCombinations(test4, sum4);
	  }

	}


