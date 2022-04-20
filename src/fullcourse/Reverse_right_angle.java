package fullcourse;

public class Reverse_right_angle 
{
	public static void main(String [] args)
	{
		Reverse_right_angle x=new Reverse_right_angle();
		x.reverse();
	}
	public void reverse()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print("*");
			}System.out.println( );
	}
	
}
}