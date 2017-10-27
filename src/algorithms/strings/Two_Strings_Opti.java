package algorithms.strings;

import java.util.Scanner;

public class Two_Strings_Opti {
	public static void main(String[] args) {
		int loopcount =0;
		Scanner sc=new Scanner(System.in);
		int givencount = sc.nextInt();
        for(int k=0;k<givencount;k++)
        {
            String str1 = sc.next();
		    String str2 = sc.next();
            int achievedcount =0;		
            int stelen1=str1.length();
            int stelen2=str2.length();           
			lb1: for(int i=0;i<=(stelen1)-i;i++)
			{
				for(int j=0;j<stelen2;j++)  
				{
					loopcount++;
					if(str1.charAt(i)==str2.charAt(j))
					{
						achievedcount++;					
						//ch2[j] = '\0';	
						break lb1;
					}
					if(str1.charAt((stelen1)-1-i)==str2.charAt(j))
	                {
	                    achievedcount++;					
						//ch2[j] = '\0';	
						break lb1;
	                }
				}
			}			
			if(achievedcount == 1)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
        }
        System.out.println(loopcount);
	}
}

