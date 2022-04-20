package star_patterns;

public class Left_base_right_angle 
{
	public static void main(String [] args)
	{
		Left_base_right_angle x=new Left_base_right_angle();
		x.left();
	}
	public void left()
	{	
		int n=5;
		for(int i=1;i<=n;i++) // 1
		{
			for(int j=1;j<=i;j++)//1
			{
				System.out.print("* ");
			}
			/*for(int j=i;j<=n;j++) //1 ,2,
			{
				System.out.print(" ");
			}*/System.out.println(); 
		}
	}
}
