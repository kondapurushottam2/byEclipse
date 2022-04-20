package star_patterns;

public class Square {
	int n=5;
	public static void main(String[] args) 
	{
		Square x=new Square();
		x.choukon();
		x.second();
		x. A();
		x.B();
		x.triangle();
		x.third();
	}
	public void choukon()
	{	

		for(int i=1;i<=n;i++) // choukon
		{	

			for(int j=1;j<=n;j++)
			{	
				if (j==1 || j==n || i==1||i==n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}System.out.println();
		}
	}


	public void second()

	{
		for(int i=1;i<=n;i++)
		{	

			for(int j=1;j<=n;j++)
			{	
				if (i==n/2+1 || j==n/2+1 )
					System.out.print("* ");
				else
					System.out.print("  ");
			}System.out.println();
		}
	}


	public void A()
	{

		int n=5;
		for(int i=1;i<=n;i++)
		{	

			for(int j=1;j<=n;j++)
			{	
				if (i==j || i+j==n+1 )
					System.out.print("* ");
				else
					System.out.print("  ");
			}System.out.println();
		}
	}
	public void B()
	{
		for(int i=1;i<=n;i++)
		{	
			for(int j=1;j<=n;j++)
			{	
				if (i==1||j==1||i==n||j==n )
					System.out.print("* ");
				else
					System.out.print("  ");
			}System.out.println();
		}		


		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{	
				if (i==1||i==n||i==j||j==1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}System.out.println();
		}




		for(int i=1;i<=n;i++)
		{
			for (int j=i;j<=n;j++)
			{	
				if(i==1||i==j||j==n)
					System.out.print("* ");
				else
					System.out.print("  "
							+ "");
			}System.out.println();
		}
	}

	public void triangle()
	{
		for(int i=1;i<=n;i++) // triangle
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<i;j++)
			{	if(i==n||j==1)
				System.out.print("* ");
			else
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{	if(i==n||j==i)
				System.out.print("* ");
			else
				System.out.print("  ");
			}System.out.println();
		}
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<i;j++)
			{	
				if (j==1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{ 	if(j==i)
				System.out.print("* ");
			else
				System.out.print("  ");
			}System.out.println();
		}
	}
	public void third()
	{	int n=5;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("  ");
		}
		for(int j=i;j<n;j++)
		{	if(j==i)
			System.out.print("* ");
		else
			System.out.print("  ");
		}
		for(int j=i;j<=n;j++)
		{ if(j==n)
			System.out.print("* ");
		else
			System.out.print("  ");
		}System.out.println();
	}
	}
}





