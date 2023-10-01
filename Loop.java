import java.io.*;
import java.util.*;
public class Loop
{
	public static void main( String args[] )
	{
		int x = 5;
		while ( x < 10 )
		{
			System.out.print( " " + x );
			x++;
		}
		System.out.println();

		//====
		


		for( int i = 5 ; i < 10 ; i++ )
			System.out.print( i + " " );

		System.out.println();




		for( int i = 1 ; i <= 20 ; ++i )
		{
			if ( i%2 == 0 )
				System.out.print( i + " " );
		}
		System.out.println();



		String name = "stanleyyelnats";

		for ( int i = 0 ; i < name.length() ; i++ )
			System.out.print( name.charAt(i) + " " );

		System.out.println();

	}
}