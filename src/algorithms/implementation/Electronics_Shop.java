package algorithms.implementation;
import java.util.*;

public class Electronics_Shop 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int m=sc.nextInt();
		int k=sc.nextInt();
		int u=sc.nextInt();
		int kar[]=new int[k];
		int uar[]=new int[u];
		
		
		for(int i=0;i<k;i++)
		{
			kar[i]=sc.nextInt();
		}
		for(int j=0;j<u;j++)
		{
			uar[j]=sc.nextInt();
		}
		
		int kmax =0;
		for(int i=0;i<k;i++)
		{
			if(kar[i] < m)
			{
				if(kmax < kar[i])
				{
					kmax = kar[i];
				}
			}
		}
		System.out.println("here is the kmax "+kmax);
		int umax = 0;
		for(int j=0;j<u;j++)
		{
			if(uar[j] < m)
			{
				if(umax < uar[j])
				{
					umax = uar[j];
				}
			}			
		}
		System.out.println("here is the umax "+umax);
		int remM =0;
		if(kmax == 0)
		{
			System.out.println(-1);
		}
		else if(umax == 0)
		{
			System.out.println(-1);
		}
		else if(kmax == m)
		{
			System.out.println(-1);
		}
		else if(umax == m)
		{
			System.out.println(-1);
		}
		else if(kmax > umax)
		{
			remM = m - kmax;
			int up=0;
			for(int i=0;i<u;i++)
			{
				if(uar[i] <= remM)
				{
					if(remM > up)
					{
						up = uar[i];
					}
				}								
			}	
			System.out.println(kmax+up);
		}				
		else
		{
			remM = m - umax;
			int kp=0;
			for(int i=0;i<k;i++)
			{
				if(kar[i] <= remM)
				{
					if(remM > kp)
					{
						kp = kar[i];
					}
				}								
			}
			
			System.out.println(umax+kp);
		}
		
		
	}

}
/*static int getMoneySpent(int[] keyboards, int[] drives, int s){
		        int spent = -1;
		        Arrays.sort(keyboards);
		        Arrays.sort(drives);
		        for (int i = keyboards.length - 1; i >= 0; i--) {
		            for (int j = drives.length - 1; j >= 0; j--) {
		                int total = keyboards[i] + drives[j];
		                
		                if (total <= s) {
		                    spent = Math.max(spent, total);
		                }
		            }
		        }

		        return spent;
		    }
 * 
 * 
 * 
 */
