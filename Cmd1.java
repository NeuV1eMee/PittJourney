import java.io.*;
import java.util.*;

public class Cmd1
{ 						
	public static void main (String[] args)  throws Exception
	{
		Scanner infile = new Scanner( new File( args[0] ) );
		int lineNum = 0;
		while( infile.hasNext() )
		{
			String line = infile.nextLine();
			System.out.format( "%2d: %s\n", ++lineNum, line );
		}
	
	} // END main
}