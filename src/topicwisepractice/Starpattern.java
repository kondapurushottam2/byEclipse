package topicwisepractice;

public class Starpattern 
{
		public static void main(String [] args)
		{
			Starpattern x=new Starpattern();
			x.star();
			//second();
			//third();
		}
		public void star()
		{
			for ( int i=1;i<=5;i++) /// 1 , 2 
			{  
				for (int j=1;j<=i;j++) // 1  
				{
					System.out.print("* "); // 1, 
				}System.out.println( );
			}
			for (int i=1;i<=5;i++) // 1   ,2
			{	
				for ( int j=i;j<5;j++)
				{
					System.out.println( );
				}
				for (int k=1;k<=i;k++) // ,            
				{
					System.out.print("* ");
				}System.out.println( );
			}
			
		}
	/*	public static void second()
		{
			for (int k=1;k<=5;k++) // 1   ,2
			{
				for (int d=4;d>=k;d--) // ,            
				{
					System.out.print("* ");
				}System.out.println( );
			}
		}
		public static void third()
		{
			for (int k=5;k<=10;k++) // 1   ,2
			{
				for (int d=1;d<=k;d++) // ,            
				{
					System.out.print("* ");
				}System.out.println( );.
			}
		}*/
}
