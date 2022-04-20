package fullcourse;

public class Square 
{
	public static void main(String [] args)
	{
		Square x=new Square();
		x.one();
		x.choukon();
		x.second();

	}
	public void choukon()
	{
		for (int i=1;i<=4;i++) // 1
		{
			for (int j=1;j<=4;j++) // 1 
			{
				System.out.print("* ");
			}System.out.println();
		}
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
				System.out.print("* ");
			}System.out.println();
		}
	}
	public void second()
	{
		for (int i=4;i>=1;i--)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}System.out.println();
		}
	}
}