package star_patterns;

public class Ghar 
{
	public static void main(String [] args)
	{
		Ghar x=new Ghar();
		x.house();
		x.lower_side();
	}
	public void house()
	{	int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print("* ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			for(int j=1;j<=i;j++)
			{	
				System.out.print("@ ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print("@ ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print("@ ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("@ ");
			}System.out.println();
		}
	}
	public void lower_side()
	{ 	int n=23;
		for(int i=1;i<=n;i++ )
		{
			for(int j=1;j<=n;j++)
			{	
				if(i==1||j==1||i==n||j==n||j==11)
				System.out.print("* ");
				else
					System.out.print("  ");
			}System.out.println();
			
		}
		/*for(int i=1;i<=n;i++ )
		{
			for(int j=1;j<=n;j++)
			{	
				if(i==1||j==1||i==n||j==n)
				System.out.print("* ");
				else
					System.out.print("  ");
			}*/
		}
	}

