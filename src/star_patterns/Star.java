package star_patterns;

public class Star
{
	public static void 	main(String [] args)
	{
		Star x=new Star();
		x.start();
	}
	public void start()
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("   ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}System.out.println();
					
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" & ");
			}System.out.println();
		}
	}
}
