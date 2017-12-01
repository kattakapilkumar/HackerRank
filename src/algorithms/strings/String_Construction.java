package algorithms.strings;

import java.util.Scanner;
public class String_Construction 
{
	public String[] makesubstrings(String str)
	{
		return null;
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String p ="";
		int n = sc.nextInt();
		int count=0;
		String finalstr="";
		for(int i=0;i<n;i++)
		{
			String str=sc.nextLine();
			int slen = str.length();
			
			
			for(int j=0;j<slen;j++)
			{
				finalstr = p.concat(str.substring(0,1));
				count++;
			}
			
			
			if(finalstr.equals(str))
			{
				System.out.println(count);
			}
			
			
		}
		

	}
}
