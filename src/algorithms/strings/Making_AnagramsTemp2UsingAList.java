package algorithms.strings;


import java.util.*;


public class Making_AnagramsTemp2UsingAList {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner k=new Scanner(System.in);
		
		String s1=k.nextLine();
		String s2=k.nextLine();
		
		ArrayList<Character> a=new ArrayList<Character>();
		ArrayList<Character> b=new ArrayList<Character>();
		        for(Character c:s1.toCharArray())
		            a.add(c);
		        for(Character c:s2.toCharArray())
		            b.add(c);
		        int c=0;
		       for(char i=97;i<123;i++){
		          int res1=Collections.frequency(a,i);
		           int res2=Collections.frequency(b,i);
		           if(res1==0 && res2==0){}
		           else if(res1>res2)
		              c+=res1-res2;
		            else if(res1<res2)
		               c+=res2-res1;
		       }
		      System.out.println(c);
		
		
		
	}

}
