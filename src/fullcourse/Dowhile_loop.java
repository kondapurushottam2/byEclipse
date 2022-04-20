package fullcourse;

import java.util.Scanner;

public class Dowhile_loop
{
	public static void main(String [] args)
	{
		Dowhile_loop s=new Dowhile_loop();
		s.print_even();
	}
	public void print_even()
	{
		int a,i=1;
		Scanner obj = new Scanner(System.in);
		System.out.println("enter your number..");
		a=obj.nextInt();
		if (a%2==0)
		{
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd");
		}
		do 
		{
			System.out.println(a);
			a+=2;
			i++;
		}
		while(i<=100);
	}
}
