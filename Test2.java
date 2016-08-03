/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Test2
{
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		for( int i = 2; i < 8; i++ ){
			int min = getMin(i);
			for( int j = 1; j < Math.pow(10,i); j++ ){
				System.out.println(j+"th number from "+min+getnNext(min,i,j);
			}
		}
		
		for( int i = 2; i < 8; i++ ){
			int max = getMax(i);
			for( int j = 1; j < Math.pow(10,i); j++ ){
				System.out.println(j+"th number from "+min+getnPrevious(min,i,j);
			}
		}
		
		
	}
}