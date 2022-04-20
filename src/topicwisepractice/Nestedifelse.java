 package topicwisepractice;
import java.util.Scanner;
public class Nestedifelse {
	public static void main(String [] args)
	{
		int a,b,c;
		System.out.println("enter three  numbers");
		Scanner obj = new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
		c=obj.nextInt();
		
		if (a>b)
		{   if (a>c)
		{
			System.out.println("maximum number in these three number is: "+a);
		}
		    else 
		{
		    	System.out.println("maximum number in these three number is:"+c);
		}
			
		}
		else
		{    if (b>c)
		{
			System.out.println("maximum number in these three number is:"+b);
		}
	      	else
		{
	      		System.out.println("maximum number in these three number is:"+c);
		}
			
		}
		
	}

}
