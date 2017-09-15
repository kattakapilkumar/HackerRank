package algorithms.implementation;


import java.util.*;
public class Birthday_Chocolate {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       Scanner kapil=new Scanner(System.in);
       int n=kapil.nextInt();
       int givenAr[]=new int[n];
       for(int i=0;i<n;i++)
       {
    	   givenAr[i]=kapil.nextInt();
       }
       int reqSum=kapil.nextInt();
       int subArlen=kapil.nextInt();
       //int finalcount=0;
       int count =0;
       int sum=0;
       int[] sumAr=new int[subArlen];
       for(int j=0;j<=n-subArlen;j++)
       {
    	   sum = 0;
    	   System.out.println("the j value is &&&& "+j);
    	   System.out.println("the elements are ***###***");
    	   int s=j;
    	   for(int z=0;z<subArlen;z++)
    	   {
    		   
    		   System.out.println(givenAr[s]);
    		   sumAr[z] = givenAr[s];
    		   s++;
    		   
    	   }
    	   System.out.println("the value of  s is  "+s);
    	   System.out.println("the elements are ***###***");
    	   for(int k=0;k<subArlen;k++)
    	   {
    		   sum = sum + sumAr[k];
    	   }
    	   System.out.println("the sum is ===   " +sum);
    	   if(sum == reqSum)
    	   {
    		   count++;
    	   }
       }
    	 System.out.println(count);
		
	}

}
