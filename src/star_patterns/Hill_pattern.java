package star_patterns;

public class Hill_pattern
{
	public static void main(String [] args)
	{
		Hill_pattern x=new Hill_pattern();
		x.dongar();
	}
	public void dongar()
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.print("*");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}System.out.println();
		}
	}
}
