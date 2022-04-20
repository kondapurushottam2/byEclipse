package number_programs;

public class Factorial_number
{
	public static void main(String [] args)
	{
		Factorial_number x=new Factorial_number();
		x.factorial();
	}
	public void factorial()
	{
		int fact=1,number=5;
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of a "+number +"= "+fact);
	}
}

