/***********************************************
 * purpose : find the roots of the equation
 * 			 a*x*x + b*x + c
 *           
 * @author Dipendra Rana
 * @version 1.0
 * @since 26 August 2017          
 ***********************************************/

package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Quadratic {

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aValue = input.nextInt();
		int bValue = input.nextInt();
		int cValue = input.nextInt();
		Utility.quadraticRootFinder(aValue, bValue, cValue);
	}

}
