package fullcourse;

import java.util.Scanner;

public class While_loop 
{
	public static void main(String [] args)
	{
		While_loop s=new While_loop();
		s.table();
	}
	public void table()
	{
		int a,i=1;
		Scanner s = new Scanner(System.in);
		System.out.println("enter your number..");
		a=s.nextInt();
		
		while( a>0 && i<=9)
		{	
			i++;
			a++;
			System.out.println(a);	
			
			}	
		 int b=s.nextInt();
		while( b>=0)
		{
			if(b%2==0)
			{
				System.out.println("number is even");
				break;
			}
			else
			{
				System.out.println("number is odd");
				break;
			}
	}
}
}

