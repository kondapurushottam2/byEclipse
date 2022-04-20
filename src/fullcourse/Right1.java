package fullcourse;

public class Right1 
{
	public static void main(String [] args)
	{
		Right1 x=new Right1();
		x.one();
	}
	public void one()
	{
		for (int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" * ");
			}System.out.println();
		}
	}
}
