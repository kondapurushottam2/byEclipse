package topicwisepractice;
import java.util.Scanner;
public class Evennum 
{
	//int a;
	//int b;

	public static void main (String [] args)
	{
		System.out.println("print all even numbers in 40 to 80 numbers");

		Evennum obj =new Evennum();
		obj.even();
		
		//obj.odd();
	}
	public void even()
	{
		System.out.println("print all odd numbers in 1 to 100 numbers");
		//int a;
		//Scanner obj = new Scanner(System.in);
		//	 a=obj.nextInt();
		for ( int a=1; a<=100;a++) // a+=2, a-=2, a&=2,a|=2,
		{
			if(a%2==0) {
				System.out.println(a+" even");
			}
			else 
			{
				System.out.println(a+ " odd ");
			}
			
		}
	}
	}
	/*public void odd()
	{
		for (int b=41;b<=80;b+=2)
		{
			System.out.println(b);
			
		}
	}

} /* for ( initialization, condition, ind )
 */

