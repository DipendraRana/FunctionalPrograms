/*********************************************************************
 * purpose : Given the temperature t (in Fahrenheit) and the wind
 * 			 speed v (in miles per hour), find the effective
 * 			 temperature (the wind chill)
 *           
 * @author Dipendra Rana
 * @version 1.0
 * @since 26 August 2017          
 *********************************************************************/

package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tempFahrenheit = Double.parseDouble(args[0]);
		double speed = Double.parseDouble(args[1]);
		Utility.effectiveTemperature(tempFahrenheit, speed);
	}

}
