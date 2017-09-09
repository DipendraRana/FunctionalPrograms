/***********************************************
 * purpose : Prints the Nth harmonic number:
 * 			 1/1 + 1/2 + ... + 1/N 
 *           
 * @author Dipendra Rana
 * @version 1.0
 * @since 26 August 2017          
 ***********************************************/

package com.bridgelabz.programs;

import java.util.Scanner;
import com.bridgelabz.utility.Utility;

public class HarmonicNumber {
	
	public static Scanner input=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ntimes=input.nextInt();
		Utility.harmoninumber(ntimes);
	}

}
