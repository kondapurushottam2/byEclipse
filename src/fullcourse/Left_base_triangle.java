package fullcourse;

public class Left_base_triangle 
{
	public static void main()
	{
		Left_base_triangle x=new Left_base_triangle();
		
		x.right();
		x.down();
	}
		public  void right()
		{
		for (int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");

			}System.out.println( );
		}
		}
		public  void down()
		{	 
		for (int i=4;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");

			}System.out.println( );
		}
	}
	}
	
	