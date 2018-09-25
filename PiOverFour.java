/*
	Exercise 0 Part 2
	Class: CS335
	Author: Daniel Munchbach
	Date: August 22, 2018
	Summary: Program that estimates the value of pi/4 using an alternating infinite
	series. Determines the terms of the series needed to get 8 digits of precision.
*/

import java.lang.Math.*;
public class PiOverFour
{	//class function that performs the approximation
	public static void sum()
	{
		double total = 4;
		/*arbitrary value for determining number of digits
		//can be higher but loop terminates once it finds the first
		//value that is equal to pi*/
		final int max_range = 1000000;
		for(double i = 1; i <= max_range;i++)
		{	/*Loop starts at value of 1 and either adds or subtracts
			//based on whether we arrive at a negative or positive term*/
			if(i%2 == 0)
				total += 4*(1/((i*2)+1));
			else
				total += -4*(1/((i*2)+1));
			double terms = i;
			/*basic way to truncate decimal places so we can mach the value
			we obtain from the loop to a value of pi with 8 decimal precision*/
			total = Math.floor(total * 1000000000) / 1000000000;

			if( total == 3.14159265 )
			{
				System.out.println(total);
				System.out.println("Terms needed to approximate PI to 8 digits of accuracy: " + terms + "\n");
				break;
			}
		}
		//System.out.println(total);
	}
	public static void main(String[] args)
	{
		sum();
	}
}
