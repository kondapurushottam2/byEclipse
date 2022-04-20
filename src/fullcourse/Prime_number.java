package fullcourse;


	import java.util.Scanner;
	public class Prime_number
	{
	public static void main(String [] args)
	{
	int count=0;
	Scanner s = new Scanner(System.in);
	System.out.println("enter your number");
	 int nums=s.nextInt();

	for(int i=2;i<=(nums-1);i++)
	{
		
	  if (i%2==0)
	  {
		count+=1;
	  }
	}
	if (count==0)
		{
		System.out.println(" number is a prime");
		}
		else
		{
		System.out.println("non prime number");
		}
	}
	}


