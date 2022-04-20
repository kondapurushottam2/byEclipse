package fullcourse;

import java.util.Scanner;

public class Condition_if
{
	 public static void main(String [] args)
	 {
		 Condition_if o= new Condition_if();
		 o.if_con();
	 }
	 public void if_con()
	 {
		 Scanner s=new Scanner(System.in);
		 System.out.println("enter passward");
		int passward= s.nextInt();
		if (passward==123)
		{
			System.out.println("you are succesfully log in to the system");
		}
	 }
}
