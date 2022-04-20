package fullcourse;

import java.util.Scanner;

public class Condition_elseif extends Assignment_operator
{
	public static void main(String [] args)
	{
		Condition_elseif s=new Condition_elseif();
		s.passing_criteria();
		s.override();
		Assignment_operator x= new Condition_elseif();
		x.override();
		
	}
	
	public  void override() {
		System.out.println("static method2");
	}
	
	public void passing_criteria()
	{
		int marks;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter your marks");
		marks=obj.nextInt();
		if(marks>=35 && marks<=55)
		{
			System.out.println("passed");
		}
		else if(marks>=55 && marks<=75)
		{
			System.out.println("second class");
		}
		else if(marks>=75 && marks<=100)
		{
			System.out.println("first class");
		}
		else 
		{
			System.out.println("fail...");
		}
	}
	
}
