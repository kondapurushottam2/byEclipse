package star_patterns;

public class Topi 
{
		public static void main(String[] args) {
			Topi x=new Topi();
			x.one();
		}
		public void one()
		{	 int n=8;
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n;j++)
				{
					if((i==1&&j==1)||(j==2&&i==1)||(j==1&&i==2)||(j==2&&i==2)||(j==2&&i==3)||(j==3&&i==3)||(j==2&&i==4)||(j==4&&i==4)||(j==5&&i==5)||(j==2&&i==5)||(j==6&&i==6)||(j==2&&i==6)||(j==6&&i==7)||(j==5&&i==7)||(j==4&&i==7)||(j==3&&i==7)||(j==2&&j==7)||(i==8&&j==6)||(i==8&&j==5)||(i==8&&j==4)||(i==8&&j==3)||(i==8&&j==2)||(i==8&&j==7))
					{
						System.out.print(" * ");
					}
						else
						{
							System.out.print("  ");
						}
				}System.out.println();
			}
		}
}

