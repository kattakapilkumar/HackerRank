import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = 1;
        int secondint = 1;
        int fibosum = 0;
        int finalresulr = 0;
        
       Solution obj = new Solution();
        
        if(n==1 || n==0)  
        {           
            System.out.println(n);
        }
        else{
                int finalans = 0;
                for(int i=0;i<n-2;i++) {                     
                      finalans = obj.fibo(start,secondint,fibosum);    
                      start = secondint;
                      secondint = finalans;
                }
              System.out.println(finalans);
               
            } 
            
        
    }
    
       public int fibo(int start,int secondint,int fibosum)
      {
          //  System.out.println("i am here");
            fibosum = start + secondint ;             
            return fibosum;
         
        }
    
    
    
}