/*
		THE LAST TWO LINES OF THIS PROGRAM MIGHT LOOK LIKE THIS:

		You drove 347 miles on your last tank and just refilled with 13.73 gallons
		Therefore you got 25.2731245447924 MPG on your last tank of gas.
*/

import java.io.*;   // imports must be ABOVE the public class block
import java.util.*;

public class Prob1 // since the class is named Example the file MUST be named "Example.java" upper/lower case exactly
{
	public static void main( String args[] )
	{
		Scanner kbd = new Scanner( System.in );
		// CAPTURE USER KEYBOARD INPUT

		float miles = 0;
		float fuel = 0;
		float mpg = 0;
		// declare variable needed

		System.out.print( "How many gallons of gas you filled last time? " );
		fuel = kbd.nextFloat();

		System.out.print( "How many miles you drove?" );
		miles = kbd.nextFloat();
		// promt user and read responses from kbd

		
		mpg = miles/fuel;
		System.out.print( "You drove " + miles + " miles on your last tank and just refilled with " + fuel + " gallons. "+ "Therefore you got " + mpg + " MPG on your last tank of gas." );
		// print out the info given and the result computed (SEE Prob1.html. Wording does not have be exact)
	} // END MAIN
}