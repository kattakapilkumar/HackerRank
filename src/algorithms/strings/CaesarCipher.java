package algorithms.strings;

import java.util.Scanner;

public class CaesarCipher {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner kapil = new Scanner(System.in);
        int n = kapil.nextInt();
        String s = kapil.next();
        int k = kapil.nextInt()%26;
        char ch[] =new char[n];
        for(int i=0;i<n;i++)
        {
        	int newi=0;
            if((s.charAt(i) >= 97) && (s.charAt(i) <=122))
            {
                int cur = (int)s.charAt(i);
                newi = cur+k;
                if(newi > 122)
                {
                	newi = newi - 122;
                	newi = 96 + newi;
                }
                //System.out.println(newi);
                char tch=(char)newi;
                ch[i] = tch;
            }
            else if((s.charAt(i) >= 65) && (s.charAt(i) <= 90))
            {
            	int cur = (int)s.charAt(i);
                newi = cur+k;
                if(newi > 90)
                {
                	newi = newi - 90;
                	newi = 64 + newi;
                }
                //System.out.println(newi);
                char tch=(char)newi;
                ch[i] = tch;
            }
            else
            {
            	ch[i]=s.charAt(i);
            }
        }
        
        String nstr = String.valueOf(ch);
		System.out.println(nstr);
	}

}
