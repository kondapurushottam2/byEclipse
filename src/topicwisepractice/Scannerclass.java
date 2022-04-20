package topicwisepractice;

import java.util.Scanner;

public class Scannerclass 
{   
	int age;
	String name;
	String address;
	
	
	public static void main(String [] args)
	{	
		Scannerclass ref = new Scannerclass();
		ref.Scan();
		ref.use();
		
		
	}
	public void Scan()
	{
		
		
		System.out.println("enter your details:");
		Scanner obj = new Scanner (System.in);
		System.out.println("enter your name:");
		 name=obj.nextLine();
		System.out.println("address:");
		 address=obj.nextLine();
		System.out.println("your age");
		age=obj.nextInt();
		
	}
	public void use()
	{
		System.out.println("give output"+ name + "\n"+ address +"\n"+ age);
	} 
}
