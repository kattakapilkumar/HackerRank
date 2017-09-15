package algorithms.strings;

import java.util.*;

public class AnagramMain {

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        int t = k.nextInt();
        while (t-->0){
            String str = k.next();
            int len = str.length(), count = 0;
            if (len%2!=0){
                System.out.println(-1);
                continue;
            }
            String s1 = str.substring(0,len/2);
            String s2 = str.substring(len/2,len);
            char[] s1Chars = s1.toCharArray();
            for (char c : s1Chars)
            {
                int index = s2.indexOf(c);
                if (index == -1)
                {
                    count++;
                } 
                else 
                {
                	//System.out.println("******");
                	System.out.println("here the index value is  "+index);
                	//System.out.println("******");
                    s2 = s2.substring(0,index)+s2.substring(index+1);
                    //String s3=s2.substring(index+1);
                  //  System.out.println("###########");
                  //  System.out.println(s2.substring(0,index));
                  //  System.out.println("+++++++++++");
                   // System.out.println(s3);
                  //  System.out.println("==========");
                   System.out.println("here the string is "+s2);
                  //  System.out.println("###########");
                }
            }
            System.out.println(count);
        }
    }
}