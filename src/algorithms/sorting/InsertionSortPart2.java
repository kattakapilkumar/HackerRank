package algorithms.sorting;

import java.util.*;
public class InsertionSortPart2 
{
	public static void main(String[] args) 
	{
		Scanner kapil = new Scanner(System.in);
	       int n = kapil.nextInt();
	       int[] ka = new int[n];
	       for(int i=0;i<n;i++){
	            ka[i]=kapil.nextInt(); 
	       }
	       insertionSortPart2(ka); 

	}

	private static void insertionSortPart2(int[] ka) 
	{
		
		int l=ka.length;
		int minindex,presentindex;
		for(minindex = 1;  minindex<l; minindex++)
		{
			int keyorpresentminvalue = ka[minindex];
			presentindex = minindex-1;
			while(minindex>=0 && ka[presentindex] > keyorpresentminvalue)
			{
				
				ka[presentindex+1]=ka[presentindex];
				presentindex=presentindex-1;
			}
			
			ka[presentindex+1]=keyorpresentminvalue;
			
			
			printArray(ka);
		}
		
		
		
	}

	private static void printArray(int[] ka) 
	{
		// TODO Auto-generated method stub
		for(int n: ka){
	         System.out.print(n+" ");
	      }
	        System.out.println("");
	   }
	}


