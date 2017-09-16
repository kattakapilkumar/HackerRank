package algorithms.implementation;


import java.util.*;
public class Divisible_Sum_Pairs 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k = sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		int sum=0;
		int count =0;
		for(int i=0;i<n;i++)
		{
			sum=0;
			for(int j=i+1;j<n;j++)
			{
				sum=0;
				sum = ar[i]+ar[j];
				if(sum%k == 0)
				{
					count++;
				}
				
			}
		}
		
         System.out.println(count);
	}

}
