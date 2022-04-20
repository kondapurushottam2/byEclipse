package number_programs;

import java.util.Scanner;

public class Prime_identification 
{
	public static void main(String [] args)
	{
		Prime_identification obj = new Prime_identification();
		obj.prime();
	}
	public void prime()
	{
		Scanner x=new Scanner(System.in);
		System.out.println("enter your number:");
		int num=x.nextInt();
		int count=0;
		for(int i=2;i<=(num-1);i++)
		{
			if(num%i==0)
			{
				count+=1;
			}
		}
		if(count!=0)
		{
			System.out.println(num+ " is not a prime");
		}
		else
		{
			System.out.println(num+" is a prime number");
		}
	}
}
