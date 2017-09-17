package algorithms.implementation;
import java.util.*;
public class Bon_Appétit {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner kc= new Scanner(System.in);
		
		int n=kc.nextInt();
		int disl=kc.nextInt();
		//kc.nextLine();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=kc.nextInt();
		}
		int annas = kc.nextInt();
		
		int actualASum =0;
		for(int i=0;i<n;i++)
		{
			if(i != disl)
			{
				System.out.println("sum is taking place  "+arr[i]);
				actualASum = actualASum + arr[i];
			}
			System.out.println("actuall sum"+actualASum);
		}
		int annashare = actualASum / 2;
		System.out.println("anna share   "+annashare);
		
		int finalans = annas - annashare;
		if(finalans == 0)
		{
			System.out.println("Bon Appetit");
		}
		else
		{
			System.out.println(finalans);
		}
		
		

	}

}
