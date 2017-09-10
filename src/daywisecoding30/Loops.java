
package daywisecoding30;
import java.util.*;
public class Loops {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res=0;
        for(int i=1;i<=10;i++)
        {
        	res = n * i;
        	System.out.println(n+" "+"x"+" "+i+" "+"="+" "+res);
        }

	}

}
