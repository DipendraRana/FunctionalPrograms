/***********************************************
 * purpose : Take User Name as input and Replace
 *           String Template “Hello <<UserName>>, 
 * 			 How are you?”.Ensure UserName has
 * 			 min 3 char.
 *           
 * @author Dipendra Rana
 * @version 1.0
 * @since 24 August 2017          
 ***********************************************/

package com.bridgelabz.programs;

import java.util.Scanner;
import com.bridgelabz.utility.Utility;

public class StringTemplate {

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username = input.nextLine();
		Utility.replaceName(username);
	}

}
