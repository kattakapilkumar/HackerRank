package algorithms.strings;

import java.util.Scanner;

public class Two_Strings {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int givencount = sc.nextInt();
		
		String str1 = sc.next();
		String str2 = sc.next();
		
		int achievedcount =0;
		char ch2[]=new char[str2.length()];
		ch2 = str2.toCharArray();
		int strlen1=str1.length();
		int strlen2=str2.length();
		for(int i=0;i<strlen1;i++)
		{
			for(int j=0;j<strlen2;j++) // m is strting 2 length   
			{
				if(str1.charAt(i)==ch2[j])
				{
					achievedcount++;					
					ch2[j] = '\0';	
					break;
				}
			}
		}	
		//printing second char array
		/*for(char kapil1:ch2)
		{
			System.out.println(kapil1);
		}*/
		System.out.println(achievedcount);
		if(givencount == achievedcount )
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
	

}
