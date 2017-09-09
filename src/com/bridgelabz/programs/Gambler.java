/***********************************************
 * purpose : Simulates a gambler who start with
 * 			 $stake and place fair $1 bets until
 * 			 he/she goes broke (i.e. has no money)
 * 			 or reach $goal. Keeps track of the
 * 			 number of times he/she wins and the
 * 			 number of bets he/she makes. Run the
 * 			 experiment N times, averages the
 * 			 results, and prints them out.
 *           
 * @author Dipendra Rana
 * @version 1.0
 * @since 26 August 2017          
 ***********************************************/

package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Gambler {

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stake = input.nextInt();
		int goal = input.nextInt();
		int noOfTimes = input.nextInt();
		Utility.gamblingSimulator(stake, goal, noOfTimes);
	}

}
