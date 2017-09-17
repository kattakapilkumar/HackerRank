package algorithms.implementation;

import java.util.*;
public class Counting_Valleys {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String k=sc.next();
		
		char ch[]=k.toCharArray();
		 
		
		int count =0;
		int valleycount =0;
		int temp =0;
		//ArrayList al = new ArrayList();
		for(int i=0;i<ch.length;i++)
		{
			//al.add(count);
			if(ch[i] == 'U')
			{
				count++;
				//if(count == 0)
				//{
					//valleycount++;
				//}
			}
			if(count == 0 && temp <0)
			{
				valleycount++;
			}
			else
			{
				temp =count;
				count--;
				
				//int temp = count;
				//if(count < 0 && temp < count )
				//{
				//	valleycount++;
				//}
			}
		}
		//int fre=0;
		//if(al.contains(-1))
		//{
		//	 //fre = Collections.frequency(al, 0);
		//}
		//else
		//{
			
	    //}
		
		System.out.println(valleycount);
		
	}

}
