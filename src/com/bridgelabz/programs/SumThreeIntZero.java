/***********************************************
 * purpose : A program with cubic running time. 
 * 			 Read in N integers and counts the 
 * 			 number of triples that sum to exactly 0.
 *           
 * @author Dipendra Rana
 * @version 1.0
 * @since 24 August 2017          
 ***********************************************/

package com.bridgelabz.programs;

import java.util.Scanner;
import com.bridgelabz.utility.Utility;

public class SumThreeIntZero {

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = input.nextInt();
		int array[] = new int[size];
		for (int i = 0; i < size; i++)
			array[i] = input.nextInt();
		Utility.checkingInt(array);
	}

}
