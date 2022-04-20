package number_programs;

import java.util.Scanner;

public class Factors1 
{
	public static void main(String [] args)
	{	

		Factors1 x=new Factors1();
		x.one();
	}
	public void one()
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter your number:");
		int n=obj.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) //n=7 
		{
			
			if(n%i==0) {
				count=count+1;
				}
				
		}
		if (count>=2)
		{
			System.out.println(n+"is not prime number");
		}
		else { 
			System.out.println(n+"  is  prime number");
			
		}
		
	}
}
