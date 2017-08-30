package algorithms.strings;
import java.util.*;
public class Mars_Exploration 
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in); 
        String s=sc.nextLine();
     
        int count=0;
        int slen = s.length();
        int words = slen/3;
        //System.out.println(words);
        int si=0,ei=3;
        if(slen >0)
        {
      	  for(int i=0;i<words;i++)
      	  {
      		  String subs =  s.substring(si,ei);
      		 // System.out.println(subs);
      		 // System.out.println(si);
                char ch=subs.charAt(0);
                if(ch == 'S')
                {}
                 else
                     count++;
                ch=subs.charAt(1);
                if(ch == 'O')
                {}
                else
                    count++;
                ch=subs.charAt(2);
                if(ch == 'S')
                {}
                else
                    count++;
      		  /*if(!(str1.equals(subs)))
      		  {
      			  count++;
         		  }*/
      		  si=si+3;
      		  ei=ei+3;
      	  }
      	  System.out.println(count);
        }
        else
      	  System.out.println(count);
        sc.close();
	}	
   }
