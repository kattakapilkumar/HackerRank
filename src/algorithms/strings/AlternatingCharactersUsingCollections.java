package algorithms.strings;


import java.util.*;
public class AlternatingCharactersUsingCollections {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		boolean katta =false;
		Scanner kapil=new Scanner(System.in);		
		int n=kapil.nextInt();
		int count=0;
		for(int i=0;i<n;i++)
		{
			count=0;
			String s=kapil.next();
			Set cs=new HashSet();
			for(int x=0;x<s.length();x++)
			{
				katta=cs.add(s.charAt(x));
				if(!(katta))
				{
					count++;
				}
				
			}
			System.out.println(count);
			
			
		}
		
	}

}
