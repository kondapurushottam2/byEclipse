package star_patterns;

public class Right_base_right_angle
{
	public static void main(String [] args)
	{
		Right_base_right_angle x=new Right_base_right_angle();
		x.katkon();
	}
	public void katkon()
	{	int n=5;
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
