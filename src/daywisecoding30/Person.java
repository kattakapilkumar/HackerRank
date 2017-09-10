package daywisecoding30;
import java.util.Scanner;
public class Person 
{ 
	int age;
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void amIOld(int age)
	{
		
		
		if(age<13)
		{
			System.out.println("You are young.");
		}
		else if(age>=13 && age <18)
		{
			System.out.println("You are young.");
		}
		else
		{
			System.out.println("You are old.");
		}
		
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) 
		{
			int temp = sc.nextInt();
		    Person p =new Person();
		    p.setAge(temp);
		    int age = p.getAge();
		    if(age<0 )
		    	System.out.println("HAHA are you kidding!");
		    else
		    p.amIOld(age);
		
		
	}
	}
}
