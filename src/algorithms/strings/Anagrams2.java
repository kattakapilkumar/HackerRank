package algorithms.strings;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Anagrams2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner k=new Scanner(System.in);				
		int n=k.nextInt();
		//k.nextLine();
		//k.NextLine();	
		boolean katta=false;
		for(int i=0;i<n;i++)
		{
			int count =0;
			String s=k.nextLine();
			System.out.println("the "+i+"   th string is   "+s);

			int len=s.length();
			
			if(len % 2 == 1)
			{
				System.out.println(-1);
			}
			else
			{
				//katta = checkanagram(s); 
				if(katta)
				{
					System.out.println("they are palindromes");
					System.out.println(0);
				}
				else
				{
					
				}
				count =0;
				//System.out.println("the lengths are same");
				int sublen = len/2;
				String str1 = s.substring(0, len/2);
				String str2 = s.substring(len/2,len);
				
				System.out.println("************");
				System.out.println("the first string is  "+str1);
				System.out.println("the second string is  "+str2);
				System.out.println("************");
				
                //count = str1.compareTo(str2);
				int x=0;
				//************************
				//string contains method
				
				if(str1.contains(str2)) 
				{  
					System.out.println("strings are anagrams");					
					System.out.println(0);
				}															
				//************************
				while(x != sublen)
				{
					//System.out.println("here comparison is taking place");
					if(str1.charAt(x) != (str2.charAt(x)))
					{
						count++;
						
					}
					x++;
				}
				
				System.out.println(count);			
			}									
		}
				

	

	
  /*	public static boolean checkanagram(String s) 
	{
		// TODO Auto-generated method stub
		int l=s.length();		
		Set ncs = new HashSet();
		Set ncs2 = new HashSet();
		
		
			
		String str1=s.substring(0,l/2);
		String str2=s.substring(l/2,l);
		//System.out.println(str1);
		//System.out.println(str2);
		for(char kapil1:str1.toCharArray())
		{
			ncs.add(kapil1);
		}
		/*Iterator itr3=ncs.iterator();
	    while(itr3.hasNext())
	    {
	    	System.out.println(itr3.next());
	    }*/
		//for(char kapil2:str2.toCharArray())
		//{
			//ncs2.add(kapil2);
	//	}	*/
		/*Iterator itr4=ncs2.iterator();
	    while(itr4.hasNext())
	    {
	    	System.out.println(itr4.next());
	    }*/
	   /* if(ncs.size()==ncs2.size())
	    {
	    	if(ncs.containsAll(ncs2))
			{
				return true;
			}
	    }
		
		return false;
	}  */
}
}