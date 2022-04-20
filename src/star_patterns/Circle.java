package star_patterns;

public class Circle 
{
 	public static void main(String []args)
 	{
 		Circle x=new Circle();
 		x.gol();
 	}
 	public void gol()
 	{
 		int n=4;
 		for(int i=1;i<=n;i++)
 		{
 			for(int j=1;j<=n;j++)
 			{
 				if((i==2 && j==1)||(i==1 && j==2)||(i==1&&j==3)||(i==2 && j==4)||(i==3 && j==3) ||(i==3 && j==2))
 				System.out.print("@ ");
 				else
 					System.out.print("  ");
 			}System.out.println();
 		}
 	}
}
