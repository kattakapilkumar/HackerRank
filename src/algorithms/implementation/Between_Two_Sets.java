package algorithms.implementation;

import java.util.*;
public class Between_Two_Sets 
{		
		static int getTotalX(int[] a, int[] b) 
	    {
			ArrayList al = new ArrayList();
			for(int i=0;i  < a.length;i++)
			{
				al.add(a[i]);				
			}
			ArrayList al2 = new ArrayList();
			for(int i=0;i  < b.length;i++)
			{
				al2.add(b[i]);				
			}
			int srange = (int)Collections.max(al);
			int erange = (int)Collections.min(al2);
			System.out.println(srange);
			System.out.println(erange);
			lb1 :for(int v=srange;srange<=erange; srange=srange+1)
			{
				int acount  =0;
				int bcount = 0;
				int finalcount =0;
				boolean katta = false;
				for(int i=0;i<a.length;i++)
				{
					 katta = true;
					if(srange % a[i]  == 0)
					{
						acount =0;
					}
					else
					{
						acount = -1;
						break;
						 //flag = false;
					}
				}
				if(acount == -1)
				{
					continue lb1;
				}
				if(katta)
				{
					for(int j=0; j < b.length;j++)
					{
						if(b[j] % srange  == 0)
						{
							bcount =0;
						}
						else
						{
							bcount = -1;
							break;
						}
					}
					if(bcount == -1)
					{
						continue lb1;
					}
					else
					{
						if(acount ==0 && bcount ==0)
						{
							finalcount++;
						}
					}
				}
				
				
			}
	        return srange;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int m = in.nextInt();
	        int[] a = new int[n];
	        for(int a_i = 0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	        int[] b = new int[m];
	        for(int b_i = 0; b_i < m; b_i++){
	            b[b_i] = in.nextInt();
	        }
	        int total = getTotalX(a, b);
	        System.out.println(total);
	        in.close();
	    }
}
