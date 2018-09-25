/*
	Exercise 0 Part 1
	Class: CS335
	Author: Daniel Munchbach
	Date: August 22, 2018
	Summary: Program that simulates the rolling of two six-sided dice. 
	Program will run the simulation 10, 100, 1000, and 10000 times.
	Additionally, it will print out the number of times the die ended up
	as "snake eyes"(when both face up sides of the dice are equal to 1).
*/
import java.lang.Math;

public class DiceRoller
{
	public static void roll(int num)
	{
		int max = 6;
		int min = 1;
		int snake_eyes = 0;
		for(int i = 0; i <= num;i++)
		{
			int d1 = 1 + (int)(Math.random()*((max - min) + 1));
			int d2 = 1 + (int)(Math.random()*((max - min) + 1));
			if(d1 == 1 && d2 == 1)
				snake_eyes++;
		}
		System.out.print(num + " : " + snake_eyes + " Snake eyes\n");
	}
	public static void main(String[] args)
	{
		final int ten = 10, hundred = 100, thousand = 1000, Tthousand = 10000;
		roll(ten);
		roll(hundred);
		roll(thousand);
		roll(Tthousand);
	}
}
