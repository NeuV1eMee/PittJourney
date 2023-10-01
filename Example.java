// FULLY WORKING DEMO PROGRAM THAT SHOWS HOW TO DECLARE A COUPLE VARIABLES
// AND READ VALUES FROM THE USER VIA KEYBOAD TO INTO THOSE VARIABLES
// THEN PRINTS OUT THOSE VARIABLES
// READ THE CONSOLE I/0 SLIDES LISTED ON THE SYLLABUS PAGE TO SEE HOW TO DO CONSOLE I/O
// CONSOLE I/O MEANS READ A VALUE FROM THE KEYBOARD AND STORE IT INTO A VARIABLE

import java.io.*;   // imports must be ABOVE the public class block
import java.util.*;

public class Example // since the class is named Example the file MUST be named "Example.java" upper/lower case exactly
{
	public static void main( String args[] )
	{
		Scanner kbd = new Scanner( System.in ); // CAPTURE USER KEYBOARD INPUT
		String name ="n/a"; // WILL SOON HOLD WHAT THE USER TYPES AT KBD
		int age = 0;        // WILL HOLD THE AGE VALUE USER TYPES IN
		int htInches = 0;   // WILL HOLD THE HEIGHT VALUE FROM USER i.e. 73 inches is 6' 1"

		// OK WE HAVE OUR VARIABLES DEFINED TO HOLD THE USER'S INPUTS.
		// NOW PROMT THE USER TO ENTER THEM

		System.out.print( "your name? " );

		// .next() function (built into the Scanner onject) waits for user to type in a token and hit <RET>
		// ,next() just grabs the raw string/token and DOES NOT CONVERT IT to int or anything
		name = kbd.next();  // .next() pulls String out of keyboard buffer
		// NOW name contains "tim" or whatever you typed

		System.out.print( "your age? " );

		// .nextInt() grabs raw String out of keyboad buffer but CONVERTS TO AN integer (whole number)
		age = kbd.nextInt();  // if you type in any chars that are NOT 0 1 2 3 etc it will BLOW UP
		// NOW age contains (THE NUMBER) 20 (NOT THE STRING "20") or whatever you typed

		System.out.print( "your ht in inches? " );

		htInches = kbd.nextInt();  // if you type in any chars that are NOT 0 1 2 3 etc it will BLOW UP

		System.out.println( "Hello " + name + ". You are " + age + " yrs. old and " + // <= you can break a line on an operator
							(htInches/12) + " ft. " + (htInches%12) + " in. tall");

	} // END MAIN
}