package fullcourse;
import java.util.Scanner;
public class Scanne 
{		
	public static void main(String [] args)
	{	
		add();
	}
	public static void  add()
	{	int a,b,c;
	System.out.println("enter your numbers");
	Scanner o=new Scanner(System.in);
	a=o.nextInt();
	b=o.nextInt();
	
	
	c=a+b;
		System.out.println("add "+c);
	}
}
