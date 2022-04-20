package fullcourse;

public class Fulpakhru
{
	public static void main(String [] args)
	{
		Fulpakhru x=new Fulpakhru();
		x.one();
		x.second();
	}
	public void one()
	{ 
		int n=5;

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
			public void second()
			{   int n=5;
			for(int i=1;i<=n;i++)
			{
				for(int j=i;j<=n;j++)
				{
					System.out.print("*");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print(" ");
				}
				for(int j=i;j<=n;j++)
				{
					System.out.print("*");
				}System.out.println();
			}

		
	}
}
