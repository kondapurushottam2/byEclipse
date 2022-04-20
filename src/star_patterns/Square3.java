package star_patterns;

public class Square3 
{
	public static void main (String [] args)
	{
		Square3 x=new Square3();
		x.one();
	}
	public void one()
	{	int n=5;
		for (int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{	if (i==j||(j+i==(n+1)))// 
				System.out.print("* ");
			else
				System.out.print("  ");
			}System.out.println();
		}
	}
}
