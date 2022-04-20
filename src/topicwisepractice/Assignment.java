package topicwisepractice;
import java.util.Scanner;
public class Assignment 
{
	static int a;
	public static void main(String [] args)
	{
	// int a; //10
		
		System.out.println("Enter your number here..");
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();  // static variable shared across all instance/class
 // uniqe for each object
		a+=10;  // compound assignment operator     a+=10   a+10=a
		System.out.println("new value in a is :"+ a);

		a-=10;  // compound assignment operator  a=a-10  a-=10  a-10=a
		System.out.println("new value in a is :"+ a);

		a*=10;  // compound assignment operator   a=a*10    a*
		System.out.println("new value in a is :"+ a);

		a/=10;  // compound assignment operator    a=a/10
		System.out.println("new value in a is :"+ a);

		
		a%=10;  // compound assignment operator     a=a/10 
		System.out.println("new value in a is :"+ a);


	}
}
