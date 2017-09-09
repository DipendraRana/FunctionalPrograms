/*********************************************************************
 * purpose : Write static functions to return all permutation of a
 * 			 String using iterative method and Recursion method. Check
 * 			 if the arrays returned by two string functions are equal. 
 *           
 * @author Dipendra Rana
 * @version 1.0
 * @since 7 September 2017          
 *********************************************************************/

package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class StringPermutation {
	
	public static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter your Word:");
		String word=scan.next();
		char[] arrayWord=word.toCharArray();
		int length=Utility.factorial(arrayWord.length);
		String[] storeArrayRecursion=new String[length];
		//String[] storeArrayIteration=new String[length];
		Utility.stringPermutationRecursion(arrayWord, storeArrayRecursion, 0, arrayWord.length-1);
		for(int i=0;i<length;i++)
			System.out.println(storeArrayRecursion[i]);
		//System.out.println();
		//Utility.stringPermutationIteration(arrayWord,storeArrayIteration, 0, arrayWord.length-1);
		/*for(int i=0;i<length;i++)
			System.out.println(storeArrayIteration[i]);
		if(storeArrayRecursion.equals(storeArrayIteration))
			System.out.println("Two Arrays are same");
		else
			System.out.println("Two Arrays are Not same");*/
	}
}
