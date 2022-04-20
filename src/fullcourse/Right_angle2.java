package fullcourse;

public class Right_angle2 
{
	public static void main(String [] args)
	{
		right();
	}
	public static void right()
	{
		for ( int i=1;i<=4;i++)
		{
			for (int j=3; j>=i;j--)
			{
				System.out.print(" " );
			}
			for (int k=1;k<=i;k++)
			{
				System.out.print("*");
			}System.out.println();
		}
		
	}
}
