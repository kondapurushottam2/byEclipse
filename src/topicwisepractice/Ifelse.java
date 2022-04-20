package topicwisepractice;

import java.util.Scanner;
public class Ifelse {
	public static void main(String [] args ) 
	{
	int number;
	System.out.println("Enter your number here");
	Scanner obj = new Scanner(System.in);
	number=obj.nextInt();
	
	if (number>=0)
	{
		System.out.println("your number is positive");

	}
	else
	{		
		System.out.println("your number is negative");
	}
	System.out.println("thank you");

}
}