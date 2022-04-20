package fullcourse;

import java.util.Scanner;

public class For_loop 
{
	public static void main(String [] args)
	{
		For_loop s= new For_loop();
		s.table();
	}
	public void table()
	{
		int a;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter your number..");
		a=obj.nextInt();
		System.out.println("table of "+ a);
		for (int i=1;i<=10;i++)
		{
			
			System.out.println( a*i);
		}
	}
}

