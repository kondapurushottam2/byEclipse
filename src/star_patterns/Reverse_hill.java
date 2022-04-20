package star_patterns;

public class Reverse_hill
{
	public static void main(String [] args)
	{
		Reverse_hill x=new Reverse_hill();
		x.revers();
	}
	public void revers()

	{ 
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print("*");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print("*");
			}System.out.println();
		}
	}
}
