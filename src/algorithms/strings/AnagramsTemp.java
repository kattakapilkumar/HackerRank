package algorithms.strings;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class AnagramsTemp 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner k=new Scanner(System.in);		
	    int n=k.nextInt();
		k.nextLine();
	    
	    for(int i=0;i<n;i++)
		{
			
	    	String s=k.next();
			boolean katta=false;
			int slen=s.length();
		
			
			
			
			String str1=s.substring(0,slen/2);
			String str2=s.substring(slen/2,slen);
			
			Set cs=new HashSet();
			Set cs2=new HashSet();
			
			for(char c1:str1.toCharArray())
			{
				cs.add(c1);
			}
			for(char c2:str2.toCharArray())
			{
				cs2.add(c2);
			}	
			
			int count=0;
			
			if(slen %2 == 1)
			{
				
				System.out.println(-1);
			}
			
			else
			{
				int diff=0;
				katta=checkanagram(s);
				if(katta)
				{
					//System.out.println("there are anagrams");
					System.out.println(0);
					
				}
				else
				{
					//System.out.println("there are not anagrams");
					Iterator itr = cs.iterator();
					Iterator itr2 = cs2.iterator();
                    while(itr.hasNext())
	                     {
	    	                        System.out.println(itr.next());
	                        }
                        while(itr2.hasNext())
	    {
	    	System.out.println(itr2.next());
	    }
                    while(itr.hasNext())
                    {
                         if(itr.next() != itr2.next())
                        {
                            System.out.println(itr.next());
                            System.out.println(itr2.next());    
                            count++;
                        }
                        
                        
                    }
					
                    
					// diff = cs.size() - cs2.size();
					//int x=0;
                   /* while(x != slen/2)
				   {
					    //System.out.println("here comparison is taking place");
					    if(str1.charAt(x) != (str2.charAt(x)))
					    {
						    count++;
						
					     }
					         x++;
				   }*/
                    
                    
				
				System.out.println(count);	
                    
                    
					/*if(diff < 0)
					{
						diff=diff* (-1);
					}
					System.out.println(diff);*/
				}
				
		}
	    
		
			
			
			
		}
		
		

	}
	
	public static boolean checkanagram(String s) 
	{
		// TODO Auto-generated method stub
		int l=s.length();		
		Set ncs = new HashSet();
		Set ncs2 = new HashSet();
		
		
			
		String str1=s.substring(0,l/2);
		String str2=s.substring(l/2,l);
		//System.out.println(str1);
		//System.out.println(str2);
		for(char kapil1:str1.toCharArray())
		{
			ncs.add(kapil1);
		}
		Iterator itr3=ncs.iterator();
	   /* while(itr3.hasNext())
	    {
	    	System.out.println(itr3.next());
	    }*/
		for(char kapil2:str2.toCharArray())
		{
			ncs2.add(kapil2);
		}	
		/*Iterator itr4=ncs2.iterator();
	    while(itr4.hasNext())
	    {
	    	System.out.println(itr4.next());
	    }*/
	    if(ncs.size()==ncs2.size())
	    {	    	
	    	if(ncs.containsAll(ncs2))
			{
	    		//System.out.println("*******   both contains same number of elements ******");
				return true;
			}
	    }		
		return false;
	}

	

}
