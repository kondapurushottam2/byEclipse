package topicwisepractice;
import java.util.Scanner;
public class Switch
{
	public static void main(String [] args)
	{
		int day;
		System.out.println("Enter your numbers");
		Scanner obj = new Scanner(System.in);
		day =obj.nextInt();
		
		switch (day)
		{
			case 1:System.out.println("sunday");break;
			case 2:System.out.println("monday");break;
			case 3:System.out.println("tuesday");break;
			case 4:System.out.println("wensday");break;
			case 5:System.out.println("thursday");break;
			case 6:System.out.println("friday");break;
			case 7:System.out.println("saturday");break;
			
		}
	}
}
