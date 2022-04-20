package topicwisepractice;
import java.util.Scanner;
public class  Bitwise 
{
	public static void main(String [] args)
	{
		int a,b;
		System.out.println("bitwise operator operation");
		Scanner obj = new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();
		
		System.out.println("AND OPERATION :"+ (a & b));
		System.out.println("OR OPERATION :"+ (a | b));
		System.out.println("XOR OPERATION :"+ (a ^ b));
		System.out.println(" COMPLEMENT OPERATION :"+ ( ~ b));
		
	}
}
