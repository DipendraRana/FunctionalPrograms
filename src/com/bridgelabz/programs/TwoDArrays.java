/***********************************************
 * purpose : A library for reading in 2D arrays 
 * 			 of integers, doubles, or booleans 
 * 			 from standard input and printing 
 * 			 them out to standard output.
 *           
 * @author Dipendra Rana
 * @version 2.0
 * @since 24 August 2017          
 ***********************************************/

package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;
import java.util.Scanner;

public class TwoDArrays {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		System.out.println("Enter the row Value:");
		int row = scanner.nextInt();
		System.out.println("Enter the cloumn Value:");
		int coloumn = scanner.nextInt();
		System.out.println("Choose the type of Array:");
		System.out.println("1: Integer");
		System.out.println("2: Double");
		System.out.println("3: Boolean");
		int choose = scanner.nextInt();
		Utility.arrayDisplay(row, coloumn, Utility.genericTwoDArray(row, coloumn, 
							choose));
	}
}
