
import java.util.*;
import java.lang.*;
import java.io.*;

class Test{
	public static void main (String[] args) throws java.lang.Exception
	{

		int number = 4567;
		int order = 4;
		int next = Odometer.getnNext(number,order,5);
		int prev = Odometer.getnPrev(next,order,5);
		int diff = Odometer.difference(next,prev,order);
		System.out.println("number :"+number+" next :"+next+" prev:"+prev+" diff:"+diff);
		
		number = 23456789;
		order = 8;
		next = Odometer.getnNext(number,order,5);
		prev = Odometer.getnPrev(next,order,5);
		diff = Odometer.difference(next,prev,order);
		System.out.println("number :"+number+" next :"+next+" prev:"+prev+" diff:"+diff);
		
	}	
}