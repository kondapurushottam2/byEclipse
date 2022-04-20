package topicwisepractice;
import java.util.Scanner;

public class Ifstatement 
{
	public static void main(String [] args) 
	{
	int age;
	System.out.println("hello voters");
	System.out.println("eneter your age here");
	// Scanner obj = new Scanner(System.in);
	Scanner obj = new Scanner(System.in);
	age=obj.nextInt();
	
	if (age>=18)
	{
		System.out.println("you are eligible for voting");
		
	}
	if (age<=18)
	{
		System.out.println("you are not eligible for voting");
	}
	System.out.println("thank you");
}
	
}