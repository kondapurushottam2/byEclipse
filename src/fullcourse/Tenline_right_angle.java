package fullcourse;

public class Tenline_right_angle
{
	public static void main (String [] args)
	{
		Tenline_right_angle x=new Tenline_right_angle();
		x.right();
	}
	public void right()
	{
		for (int i=1;i<=10;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}System.out.println();
		}
	}
}
