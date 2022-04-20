package topicwisepractice;

public class Whileloop 
{
		public static void main(String [] args)
		{
		//	int a=2,b=1;
			
		//	System.out.println("print all even numbers");
			 
			
		//	while (a<=50)
	//		{
		//		System.out.println(a);
	//			a+=2;
		//	}
			System.out.println("print all odd numbers");
			for (int p=1;p<=100;p++)
			{ if (p>50 && p<60)
			{
				continue;
			}
				
				System.out.println( p);
			}
				int i=100;
			do 
			{
				System.out.println(  i);
				i+=100;
			} while (i<1000);
				
		}
}
