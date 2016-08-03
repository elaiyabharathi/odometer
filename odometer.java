
import java.util.*;
import java.lang.*;
import java.io.*;

class Odometer{

	
	public static int getnNext(int number,int diff,int order)
	{
	    
	    for(int i = 0;i<diff;i++)
	    {
	       number = getNext(number,order);
	    }
	    return number;
	}
	
	public static int getNext(int number,int order)
	{
	    int temp = number;
	    if(temp == getMax(order))return getMin(order);
	    temp++;
	    while(!isAscending(temp))
	    {
	        temp = getNext(temp);
	    }
	    return temp;
	}
	
	public static int getnPrevious(int number,int diff,int order)
	{
	    for(int i=0;i<diff;i++)
	    {
	        number = getPrevious(number,order);
	    }
	    return number;
	}
	
	public static int getPrevious(int number,int order)
	{
	    int temp = number;
	    if(temp == getMin(order))return getMax(order);
	    temp--;
	    while(!isAscending(temp))
	    {
	        temp = getPrevious(temp);
	    }
	    return temp;
	}
	
	public static boolean isAscending(int n,int order)
	{
		int a,b;
		for(int i=0;i<order;i++)
		{
			a=n%10;
			n=n/10;
			b=n%10;
			if(b>a)
				{
					return false;
				}
		}
		 return true;  
	}
	
	public static int difference(int a, int b)
	{
		int smaller,higher,diff;
		if(a<b)
		{
			smaller=a;
			higher=b;
		}
		else if (a<b) 
		{
			smaller=b;
			higher=a;
		}
		else
		{
			diff=0;
			return diff;
		}
		while((smaller)!=higher)
		{
			smaller=getnNext(smaller);
			diff++;
		}
		return diff;
	}
	
	public static int getMinMax(int order,int flag){
		int[] minNums = {12,123,1234,12345,123456,1234567,12345678};
		int[] maxNums = {98,789,6789,56789,456789,3456789,23456789};
		if(flag == 1){
			return minNums[order-2];
		}
		else{
			return maxNums[order-2];
		}
	}
	
	public static int getMin(int order){
		return getMinMax(order,1);
	}
	
	public static int getMax(int order){
		return getMinMax(order,2);
	}
	}