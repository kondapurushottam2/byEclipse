package fullcourse;

public class While1
{
	public static void main(String [] args)
	{
		While1 x=new While1();
		x.while_loop();
	}
	public void while_loop()
	{ 	
		int n=6;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{	if((i==2&&j==1)||(i==1&&j==2)||(i==1&&j==3)||(i==2&&j==4)||(i==3&&j==5)||(i==4&&j==5)||(i==5&&j==5)||(i==6&&j==4)||(i==6&&j==3)||(i==6&&j==2)||(i==6&&j==1)||(i==5&&j==1)||(i==4&&j==1)||(i==3&&j==1))
				System.out.print(" *");
			else
				System.out.print(" ");
			}System.out.println();
		}
	}
}
