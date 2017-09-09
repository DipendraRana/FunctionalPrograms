/***********************************************
 * purpose : This program takes a command-line 
 * 			 argument N and prints a table of 
 * 			 the powers of 2 that are less than
 * 			 or equal to 2^N
 *           
 * @author Dipendra Rana
 * @version 1.0
 * @since 24 August 2017          
 ***********************************************/

package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int power = Integer.parseInt(args[0]);
		Utility.powerOf2(power);
	}
}