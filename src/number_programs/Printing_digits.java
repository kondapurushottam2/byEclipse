package number_programs;

public class Printing_digits 
{
	public static void main(String [] args)
	{
		Printing_digits x=new Printing_digits();
		x.digits();
		x.reverse();
	}
	public void digits()
	{	int n=2518;
	//int d=0;
	//int m=n;
	while(n!=0)
	{
		int d=n%10;
		
		System.out.print(d);
		n=n/10;
	}	
	}
	public void reverse()
	{
		int n=12356;
		int sum=0;
		while(n!=0)
		{
			
			int d=n%10;
			 sum=(sum*10+d);
			 n=n/10;
		}
		System.out.println("\n"+sum);
	}
}
