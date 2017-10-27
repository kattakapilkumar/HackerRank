package algorithms.strings;

import java.util.Scanner;

public class Two_Strings_nsquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int givencount = sc.nextInt();
        int loopcount=0;
        for(int k=0;k<givencount;k++)
        {
            String str1 = sc.next();
		    String str2 = sc.next();
            int achievedcount =0;
            
		//char ch2[]=new char[str2.length()];
		//ch2 = str2.toCharArray();
		lb1: for(int i=0;i<=str1.length();i++)
		{
            //loopcount++;
			for(int j=0;j<str2.length();j++) // m is strting 2 length   
			{
                loopcount++;
				if(str1.charAt(i)==str2.charAt(j))
				{
					achievedcount++;					
					//ch2[j] = '\0';	
					break lb1;
				}              
			}
		}	
		//printing second char array
		/*for(char kapil1:ch2)
		{
			System.out.println(kapil1);
		}*/
		//System.out.println(achievedcount);
		if(achievedcount == 1 )
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
        }
		
		//String str1 = sc.next();
		//String str2 = sc.next();
		System.out.println(loopcount);
		

	}

}
