package fullcourse;

import java.util.Scanner;

public class Nested_if_else 
{
	public static void main(String [] args)
	{
		Nested_if_else s = new Nested_if_else();
		s.comparison();
	}
	public void comparison()
	{
		int a,b,c;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter your numbers ");
		a=obj.nextInt();
		b=obj.nextInt();
		c=obj.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("max value "+a);
			}
			else
			{
				System.out.println("max value "+c);
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("max value "+b);
			}
			else
			{
				System.out.println("max value "+c);
			}
		}
}
}