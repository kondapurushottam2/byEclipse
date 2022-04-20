package fullcourse;

import java.util.Scanner;

public class Condition_ifelse 
{
	public static void main(String [] args)
	{
		Condition_ifelse s=new Condition_ifelse();
		s.voting_criteria();
	}
	public void voting_criteria()
	{
		int age;
		System.out.println("enter your age ");
		Scanner obj = new Scanner(System.in);
		age=obj.nextInt();
		if(age>=18)
		{
			System.out.println("your are eligible for voting");
		}
		else
		{
			System.out.println("sorry your are not eligible for voting");
		}
			
		
		
		
	}
}
