package topicwisepractice;
import java.util.Scanner;
public class Arithmatic
{
	public static void main(String [] args)
	{
		int a,b;
		System.out.println("Enter two numbers.....");  // 
		Scanner obj =new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
		System.out.println("addition "+(a+b));    //+ , - ,/ , * , %
		System.out.println("substraction "+(a-b));
		System.out.println("mutiplication "+(a*b));
		System.out.println("division "+(a/b));
		System.out.println("remainder "+(a%b));   // 


	}
}
