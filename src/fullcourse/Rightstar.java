package fullcourse;

public class Rightstar
{
	public static void main(String [] args)
	{
		Rightstar x=new Rightstar();
		x.rightangle();
	}
	public void rightangle()
	{
		for (int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}System.out.println();
		}
	}
}
