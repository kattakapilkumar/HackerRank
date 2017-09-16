package algorithms.implementation;

import java.util.*;
public class Migratory_Birds
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		int count1=0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		for(int j=0;j<n;j++)
		{
			if(ar[j] == 1)
			{
				count1++;
			}
			if(ar[j] == 2)
			{
				count2++;
			}
			if(ar[j] == 3)
			{
				count3++;
			}
			if(ar[j] == 4)
			{
				count4++;
			}
			if(ar[j] == 5)
			{
				count5++;
			}
		}
		
		ArrayList al=new ArrayList();
			al.add(count1);
			al.add(count2);
			al.add(count3);
			al.add(count4);
			al.add(count5);
			int maxcount = (int)Collections.max(al);
		//System.out.println(maxcount);
		int indexv = al.indexOf(maxcount);
		System.out.println(indexv+1);
		//int getv = (int)al.get(indexv);
		//System.out.println(getv);
		
	}

}
