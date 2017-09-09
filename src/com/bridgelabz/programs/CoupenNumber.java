/***********************************************
 * purpose : Given N distinct Coupon Numbers, 
 *           how many random numbers do you need
 *           to generate distinct coupon number?
 *           This program simulates this random 
 *           process.
 *           
 * @author Dipendra Rana
 * @version 1.0
 * @since 24 August 2017          
 ***********************************************/

package com.bridgelabz.programs;

import java.util.Scanner;
import com.bridgelabz.utility.Utility;

public class CoupenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Utility.couponGenerator(scan.nextInt());
		scan.close();
	}

}
