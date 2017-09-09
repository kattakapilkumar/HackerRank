package algorithms.strings;

import java.util.Scanner;

public class AlternatingCharacters {

	public static void main(String[] args) 
	{
       Scanner kapil=new Scanner(System.in);
		int count=0;
		int n=kapil.nextInt();
		String[]  words=new String[n];
 		for(int t=0;t<n;t++)
		{
 			words[t]=kapil.next();
		}
 		for(int k=0;k<words.length;k++)
 		{
 			count=0;
 			for(int j=0;j<words[k].length()-1;j++)
 			{
 				if((words[k].charAt(j))==(words[k].charAt(j+1)))
 	 			{
 					count++;
 	 			}
 			}
 			System.out.println(count);
 		}
 		
 		
 		
	}

}
