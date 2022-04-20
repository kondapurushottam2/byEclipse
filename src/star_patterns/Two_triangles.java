package star_patterns;

public class Two_triangles
{
	public static void main(String [] args)
	{
		Two_triangles x=new Two_triangles();
		x.trikon();
	}
	public void trikon()
	{ 
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}System.out.println();
		}
	}
}
