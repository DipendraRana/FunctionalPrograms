/***********************************************
 * purpose : takes two integer command-line
 * 			 arguments x and y and prints the
 * 			 Euclidean distance from the point
 * 			 (x, y) to the origin (0, 0).
 *           
 * @author Dipendra Rana
 * @version 1.0
 * @since 26 August 2017          
 ***********************************************/

package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int xPoint=Integer.parseInt(args[0]);
		int yPoint=Integer.parseInt(args[1]);
		Utility.euclideanDistance(xPoint, yPoint);
	}

}
