
import java.io.*;
import java.util.*;

public class CmdArgs    //   0   1   2    3    4
{ 						//	[hi][my][name][is][tim]
	public static void main (String[] args)  throws Exception
	{
		System.out.println("you entered " + args.length + " extra tokens on the cmd line");

		Scanner infile = new Scanner( new File( args[0] ) );

		while ( infile.hasNext() )  // .hasNext() ask if there is another word in the file?
		{
			String word = infile.next();  // grabs the next word from file
			if ( isPalindrome( word ) )
				System.out.println( word + " is a palindrome");
			else
				System.out.println( word + " NOT a palindrome");

		}
	} // END main

	//------------------------------------------------------------------------------------

	static boolean isPalindrome( String word )
	{
//		      01234567890123
// word: --> "stanlayyelnats"
//            L            R

		word = word.toLowerCase();
		// make s all caps or all lower ... your choice
		int L = 0;
		int R = word.length()-1;

		while( L < R )
		{
			if ( word.charAt(L) != word.charAt(R) )
		      	 return false;
		    else
		    	L = L + 1;
		    	R = R - 1;
		      //increment L
		      //decrement R
		}

		// what if you make it here
		return true;

	} // END IF ISPAL FUNCTION

}