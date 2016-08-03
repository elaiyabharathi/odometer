
import java.util.*;
import java.lang.*;
import java.io.*;

class Test{
	public static void main (String[] args) throws java.lang.Exception
	{

		int number = 24567;
		int order = 5;
		int next = odometer.getnNext(number,50,order);
		System.out.println("next: "+next);
		int prev = odometer.getnPrevious(number,5,order);
		System.out.println("previous: "+prev);
		int diff = odometer.difference(12345,23456,5);
		System.out.println("diff: "+diff);
		
	}	
}