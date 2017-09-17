package algorithms.implementation;

import java.util.Scanner;

public class Drawing_Book {

	public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int p=sc.nextInt();
        if(n==p)
        {
            System.out.println(0);
        }
        else if(p==1)
        {
            System.out.println(0);
        }
        else
        {
        	int count =0;
            if(n%2 == 0)
            {
                int currentPage =0;
                //System.out.println("the page is having even pages");
                int froms = p - 1;
                int frome = n-p;
                if(froms < frome)
                {
                    currentPage = 1;
                    
                    while(currentPage < p)
                    {
                        
                        count++;
                        currentPage = currentPage + 2;
                    }
                }
                else
                {
                    currentPage = n;
                    while(currentPage > p)
                    {
                        
                        count++;
                        currentPage = currentPage - 2;
                    }
                }
                System.out.println(count);
                    
            }
            else
            {
                int currentPage =0;
               // System.out.println("the page is having odd pages");
                int froms = p - 1;
                int frome = n-p;
                if(froms < frome)
                {
                    currentPage = 1;
                    
                    while(currentPage < p)
                    {
                        
                        count++;
                        currentPage = currentPage + 2;
                    }
                }
                else
                {
                    //count=count+1;
                    currentPage = n;
                    while(p < currentPage-1)
                        {
                        
                        count++;
                        currentPage = currentPage - 2;
                    }
                }
                System.out.println(count);
            }
            
        }
        
    }
}
