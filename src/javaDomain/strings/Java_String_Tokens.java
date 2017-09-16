package javaDomain.strings;

import java.util.*;
public class Java_String_Tokens {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        StringTokenizer st = new StringTokenizer(s,".* ' '|'!'|','|'?'|'.'|'_'|'\''|'@'");
        // Write your code here.
       // String s2=s.replaceAll("\\W","\n");
       // String[] words=s2.split("\n");
        /*int count=0;
        for(int i=0;i<words.length;i++)
            {
            if(!words[i].equals(""))
            {
                count++;
             }
            }
        System.out.println(count);
        for(int i=0;i<words.length;i++)
            {
            if(!words[i].equals(""))
            {
                
                System.out.println(words[i]);
                }
            }*/
        System.out.println(st.countTokens());
        while(st.hasMoreTokens())
            {
            System.out.println(st.nextToken());
        }

	}

}
