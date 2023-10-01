// Lab2 Starter File 

import java.io.*;
import java.util.*;


public class Lab2
{
	public static void main (String arg[])
	{

		// Create a scanner to read from keyboard
		Scanner kbd = new Scanner (System.in);

		String str;
		System.out.print("Enter a string (preferably) of length 10 to 20 characters: ");
		str = kbd.next();  // gets next token from the kbd
		

		// ECHO BACK TO USER THE ACTUAL LENGTH OF THE STRING THEY TYPED IN
		// i.e. output something like:  your string has length: 13 (or whatever it actually is. Use .length() 
		
		System.out.format("Your string has %d chars in it\n", str.length());

		// ECHO BACK TO USER A STRING OF THE  FIRST 6 CHARS OF  THEY TYPED IN.  USE .substring() 
		// i.e. output something like:  first 6 chars were: foobar
		
		System.out.format("the first six chars are: %s\n", str.substring( 0, 6 ));

		// ECHO BACK TO USER A STRING OF THE  LAST 5 CHARS OF  THEY TYPED IN  USE .substring() 
		// i.e. output something like:  last 5 chars were: World

		System.out.format("the last five chars are: %s\n", str.substring( str.length()-5 ));

		//suppose your str is "Hello"
		System.out.format("index of first occurance of 'e' is: %d\n", str.indexOf('e') );

		// ECHO BACK TO USER THE FIRST CHAR OF THEIR STRING:.  USE .charAt()
		// i.e. output something like:  first char is: H 

		System.out.format("the first chars are: %c\n", str.charAt(0) );

		// ECHO BACK TO USER THE LAST CHAR OF THEIR STRING:  USE .charAt()
		// i.e. output something like:  last char is: d

		//System.out.format("the last chars are: %c\n", str.charAt( str.length()-1 ));
		
		// SEARCH FOR THE LETTER 'a' IN THE STRING AND REPORT THE INDEX POSITION OF 'a' OR REPORT THAT IT WAS NOT FOUND   
		// Use an if else statement and use  .indexOf()
		// i.e. output something like:  Your string contains the letter a at the 5th index position 
		// OR   output something like:  Your string does not contain the letter 'a'
		
		char searchChar = 'a';

        int indexOfA = str.indexOf(searchChar);

        if (indexOfA != -1) 
        {
            System.out.println("Your string contains the letter '" + searchChar + "' at the index position " + indexOfA );
        } 
        else 
        {
            System.out.println("Your string does not contain the letter '" + searchChar + "'.");
        }

		// SEARCH FOR THE LETTER 'e' IN THE STRING AND REPORT THE INDEX POSITION OF 'e' OR REPORT THAT IT WAS NOT FOUND   
		// Use an if else statement and use  .indexOf()
		// i.e. output something like:  Your string contains the letter e at the 5th index position 
		// OR   output something like:  Your string does not contain the letter 'e'
				
		char searchChar1 = 'e';

        int indexOfE = str.indexOf(searchChar1);

        if (indexOfE != -1) 
        {
            System.out.println("Your string contains the letter '" + searchChar1 + "' at the index position " + indexOfE );
        } 
        else 
        {
            System.out.println("Your string does not contain the letter '" + searchChar1 + "'.");
        }





		if ( str.equals("Hello") )
		{
			System.out.format("%s is identical to 'Hello' \n", str);
		}
		else
		{
			System.out.format("%s is not identical to 'Hello' \n", str);
		}



	} // END main
} // END Lab2