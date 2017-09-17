package algorithms.implementation;
import java.util.*;
public class Sock_Merchant 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner kc=new Scanner(System.in);
		int n=kc.nextInt();
		int a[]=new int[n];
		for(int j=0;j<n;j++)
		{
			a[j]=kc.nextInt();
		}
		int count=0;
		Set cs=new HashSet();
		for(int k=0;k<n;k++)
		{
			//boolean katta = cs.add();
			if(cs.add(a[k]))
			{
				//count++;
			}
			else
			{
				cs.remove(a[k]);
				count++;
			}
		}
		System.out.println(count);
		
	}

}
