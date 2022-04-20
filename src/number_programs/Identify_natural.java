package number_programs;

public class Identify_natural 
{
	public static void main(String [] args)
	{
		Identify_natural x=new Identify_natural();
		x.natural();
	}
	public void natural()
	{
		for (int i=0;i<=20;i++)
		{
			if(i!=0)
			{
				System.out.println(" "+i);
			}
			/*else if (i!=0)
			{
				System.out.print("  "+i);
			}*/
		}
	}
}
