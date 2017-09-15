package algorithms.implementation;


import java.util.*;
public class Breaking_The_Records 
{

	static int[] getRecord(int[] s)
    {
		int nar[]=new int[2];
		int maxvalue  = 0;
        int minvalue  = 0;
        int count1=0;
        int count2=0;
		if(s.length > 1)
		{
			
               if(s[0] > s[1])
               {
                   maxvalue =  s[0];
                   minvalue = s[1];
                   count2++;
               }
               else if(s[0] < s[1])
               {
                   minvalue  =  s[0];
                   maxvalue = s[1];
                   count1++;
               }
            else
            {
                maxvalue = s[0];
                minvalue = s[1];
                count1=0;
                count2=0;
            }

                for(int i=2;i<s.length;i++)
                {
                    if(s[i] > maxvalue)
                    {
                        count1++;;
                        maxvalue = s[i];
                    }
                    else if(s[i] < minvalue)
                    {
                        count2++;
                        minvalue = s[i];

                    }   
                    else if(s[i] == maxvalue)
                    {

                    }	
                    else
                    {
                        
                    }

                }
                nar[0]=count1;
                nar[1]=count2;
		}
		else if(s.length == 1)
		{
			nar[0]=0;
	        nar[1]=0;
		}
        
        return nar;
        
        
    }

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++)
        {
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }

}
