package algorithms.strings;
import java.util.*;

public class Beautiful_Binary_String 
{

	public static void main(String[] args) 
	{
		Scanner kapil=new Scanner(System.in);		
		int count=0;
		/*int n=kapil.nextInt();
        //***************
		//String s=new String();
		char ch[]=new char[n];
		for(int i=0;i<n-1;i++)
		{
			ch[i]=kapil.next().charAt(i);
		}		
		String str=ch.toString();
		//***************
		String checks="010";
		int sindex=0,lindex=0;
		while(lindex+3>n)
		{
			String subs=str.substring(sindex, lindex);
			if(subs.equals(checks))
			{
				count++;
			}
			sindex=sindex+3;
			lindex=lindex+3;
		}
			
				*/
		
		int n=kapil.nextInt();
		String s=kapil.next();
		for(int i=0;i<=n-3;)
		{
			
			if(s.substring(i,i+3).equals("010"))
			{
				count++;
				i=i+3;
			}
			else
			{
				i++;
			}
			
		}
          System.out.println(count);
	}

}
