package fullcourse;

import java.util.Scanner;

public class Calculator 
{
	public static void main(String [] args)
	{
		Calculator z=new Calculator();
		z.Switch();
	}
	public void Switch()
	{
		int num1,num2,ch;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter your two numbers");
		num1=obj.nextInt();
		num2=obj.nextInt();
		System.out.println("enter your operation choice...");
		ch=obj.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("addition"+(num1+num2));
		case 2:
			System.out.println("substraction"+(num1-num2));
		case 3:
			System.out.println("multiplication"+(num1*num2));
		case 4:
			System.out.println("division"+(num1/num2));
		case 5:
			System.out.println("remainder"+(num1%num2));
			
		}
	}
}
