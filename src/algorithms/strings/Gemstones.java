package algorithms.strings;

import java.util.*;


public class Gemstones {

	public static void main(String[] args) 
	{
		Scanner kapil = new Scanner(System.in);
		
		int n= kapil.nextInt();
		String ka[]=new String[n];
		
		for(int i=0;i<n;i++)
		{
			ka[i]=kapil.next();					
		}				
		StringBuilder sb= new StringBuilder(" ");
		int strlen1= ka[0].length();
		//System.out.println("first String length is"+  strlen1);
		//int v=1;
		int count =0;
		int finalcount=0;
		int totalwords = ka.length;
        for(int x=0;x<strlen1;x++)
        {        	       	         		
        		for(int v=1; v<totalwords; v++)
        		{
        			lb1:for(int y=0; y<ka[v].length();y++)
                	{
                		if((ka[0].charAt(x)) == (ka[v].charAt(y)))
                		{
                			 count = 0;
                			 break lb1;
                		}
                		else
                		{
                			count = -1;
                		}
                		
                	}              	       			        			
        		}        		    
        		if(count == 0)
        		{
        			finalcount ++;
        		}     		
        }
		System.out.println(finalcount);				
	}

}
