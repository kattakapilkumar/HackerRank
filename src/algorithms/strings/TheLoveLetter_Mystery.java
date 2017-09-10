package algorithms.strings;

import java.util.*;
public class TheLoveLetter_Mystery 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int count=0;
		boolean checkpalindrome=false;
		Scanner kapil=new Scanner(System.in);
		int n=kapil.nextInt();
		kapil.nextLine();
		for(int i=0;i<n;i++)
		{
			String s=kapil.next();
			checkpalindrome=palindromeornot(s);
			if(checkpalindrome)
			{
				System.out.println(0);
				
			}
			else
			{
				count=0;
				//System.out.println("it is not a palindrome");
				int l=s.length();
				int i1=0;
				while((l-1) > i1 && ((i1!=(l-1))))
				{
					//System.out.println("the value is *"+i1+"*  and l value is *"+(l-1));
					//System.out.println(count);
					//System.out.println("calculated diffrence");
					int diff = ((int)s.charAt(i1)) - ((int)s.charAt(l-1));
					//System.out.println("diff is  "+diff);
					if(diff < 0)
					{
						diff = diff * (-1);
					}
					count = count + diff;
					i1++;
					l--;
					/*if(count<0)
					{
						count =count * (-1);
					}
					i1++;
					l--;*/
				}
				System.out.println(count);
			}
			
			
		}

	}

	private static boolean palindromeornot(String s) 
	{
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		//System.out.println("the reversed string is"+"   " +sb);
		if(sb.equals(s))
		{
			//System.out.println("the s is palindrome");
			return true;
		}
		return false;
	}

}
