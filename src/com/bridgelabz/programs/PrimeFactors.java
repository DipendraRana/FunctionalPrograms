/***********************************************
 * purpose : Computes the prime factorization of
 * 			 N using brute force.
 *           
 * @author Dipendra Rana
 * @version 1.0
 * @since 26 August 2017          
 ***********************************************/

package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PrimeFactors {

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = input.nextInt();
		Utility.primeFactorization(number);
	}

}
