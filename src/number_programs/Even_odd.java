package number_programs;

public class Even_odd 
{
	public static void main(String [] args)
	{
	Even_odd x=new Even_odd();
	System.out.println("print even numbers=");
	x.even();
	x.odd();
	}
	public void even()
	{
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}	
			
		}
	}
	public void odd()
	{
		System.out.print("\n print odd numbers=\n");	
		for(int j=1;j<=100;j++)
		{
			if(j%2!=0)
			{
				System.out.print(j+" ");
			}
		}
	}
}
