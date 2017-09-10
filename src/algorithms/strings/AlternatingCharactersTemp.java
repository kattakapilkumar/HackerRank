package algorithms.strings;

import java.util.*;
public class AlternatingCharactersTemp 
{

	public static void main(String[] args) 
	{
		Scanner kapil=new Scanner(System.in);
		
		int n=kapil.nextInt();
		
       
		for(int t=0;t<n;t++)
		{
			int count=0;
			String s=kapil.next();
			for(int i=0;i<s.length()-1;i++) 
			{
				if(s.charAt(i)==s.charAt(i+1))
				{
					count++;
				}
			}
				System.out.println(count);
			
		}

	}

}
