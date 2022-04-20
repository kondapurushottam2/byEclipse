package star_patterns;

public class Square11 
{
	public static void main(String [] args)
	{
		Square11 x=new Square11();
		x.one();
	}
	public void one()
	{	/*	
		for(int i=1;i<=n;i++)
		{	
		for(int j=1;j<=n;j++)
		{	
			if(j==3||i==3||i==1||j==1||i==n||j==n)
			System.out.print("* ");
			else
				System.out.print("  ");
		}System.out.println();
		}*/
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<i;j++)
			{ 
				if(i==n||i==j||j==1)
				System.out.print("* ");
				else
				System.out.print("  ");	
			}
			for(int j=1;j<=i;j++)
			{
				if(i==n||i==j)
				System.out.print("* ");
				else
					System.out.print("  ");
				
			}System.out.println();
		}
	}
}
