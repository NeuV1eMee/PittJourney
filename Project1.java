// Lab2.java Starter File

import java.io.*; // BufferedReader
import java.util.*; // Scanner

public class Project1
{
	public static void main (String args[]) throws Exception // i.e. the input file you put on cmd line is not in directory
	{
		Scanner kbd = new Scanner( System.in );

		final int LOW_RATE = 30;
		final int HIGH_RATE = 50;
		int yourRate = 0;
		String firstName;
		String lastName;
		int age;
		int speedLimit;
		int actualSpeed;
		//int mphOverLimit = actualSpeed - speedLimit;
		boolean zone = false;
		int zoneFine = 0;
		int underAgeFine = 0;
		int totalFine;

		//rule: if u more than 20 over limit you are on the HIGH_RATE
		// but if you are greater than 5 over limit (but <= 20) you are on LOW_RATE

		System.out.print("Driver's first name? " );
		firstName = kbd.next();

		System.out.print("Driver's last name? " );
		lastName = kbd.next();

		System.out.print("Your speed? " );
		actualSpeed = kbd.nextInt();

		System.out.print("Speed limit? " );
		speedLimit = kbd.nextInt();

		System.out.print("Driver's age in yrs? " );
		age = kbd.nextInt();

		System.out.print("Did violation occur in construction zone? (true of false) " );
		zone = kbd.nextBoolean();

		int mphOverLimit = actualSpeed - speedLimit;

		if ( mphOverLimit > 20 )
		{
			yourRate = HIGH_RATE;
		}
		else if ( mphOverLimit > 5 )
		{
			yourRate = LOW_RATE;
		}

		int baseFine;
		baseFine = ( yourRate * (mphOverLimit / 5) );
		// you actual fine is your RATE * whole number of 5mph over

		if ( zone == true )
		{
			zoneFine = baseFine;
		}
		
		if ( age <= 21 && mphOverLimit > 20 )
		{
			underAgeFine = 300;
		}

		totalFine = baseFine + zoneFine + underAgeFine;

		//rule: the actual fine is yourRate * ( # of multiples of 5mph over ( mphOverLimit / 5 ) )

		System.out.println("\n");
		//System.out.println("Driver's name: " + firstName + ", " + lastName);
		//System.out.println("Driver's age: " + age);
		//System.out.println("Speed limit: " + speedLimit);
		//System.out.println("Actual speed: " + actualSpeed);
		System.out.println("Mph over limit: " + mphOverLimit);
		System.out.println("Base Fine: $" + baseFine);
		System.out.println("Construction Zone Fine: $" + zoneFine);
		System.out.println("Underage Fine: $" + underAgeFine);
		System.out.println("Total Fine: $" + totalFine);


	}

} // END LAB2 CLASS












