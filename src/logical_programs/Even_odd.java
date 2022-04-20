package logical_programs;

public class Even_odd {
	
	public void even()
	{
		System.out.print("list of even numbers are  ");

		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				System.out.print(" "+i+" ");
			}
			
		}
	}
	
	public void odd()
	{
		System.out.println("");
		System.out.print("list of odd numbers are   ");
		for(int i=1;i<=100;i++)
		{
			if(i%2!=0)
			{
				System.out.print(" "+i+" ");
			}
		}
	}
	public static void main(String [] args)
	{
		Even_odd a = new Even_odd();
		a.even();
		a.odd();
	}

}
