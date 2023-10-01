// Project2.java Starter File

import java.io.*; 
import java.util.*;

public class Project2
{
	public static void main (String args[]) throws Exception // i.e. what input filename does not exist?
	{
		// ALWAYS TEST FIRST TO VERIFY USER PUT REQUIRED INPUT FILE NAME ON THE COMMAND LINE
		if (args.length < 1 )
		{
			System.out.println("\nusage: C:\\> java Project <input filename>\n\n"); // i.e. $ java Program2.java palindromes.txt
			System.exit(0);
		}
		Scanner infile = new Scanner( new File(args[0]) ); // args[0] conains string "palindromes.txt" or whatever you fed it
		while( infile.hasNextLine() ) // while there are any lines left in file
		{
			String line = infile.nextLine();
			if ( isPalindrome( line ) )
				System.out.format("%-8s IS  palindrome.\n",line);
			else
				System.out.format("%-8s NOT palindrome.\n",line);
		}
	} // END MAIN


	// RETURNs true if and only if the string passed in is a legit palindrome
	static boolean isPalindrome( String str )
	{
		str = str.toLowerCase();
		
		int L = 0;
		int R = str.length()-1;

		while( L < R )
		{
			if ( str.charAt(L) != str.charAt(R) )
		      	 return false;
		    else
		    	L = L + 1;
		    	R = R - 1;
		      
		}

		return true;
	}
} // END PROGRAM2 CLASS












