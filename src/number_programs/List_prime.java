package number_programs;

public class List_prime 
{
	public static void main(String [] args)
	{
		List_prime x=new List_prime();
		x.prime();
	}
	public void prime()
	{
		System.out.print(" all prime numbers:");
		for(int i=1;i<=100;i++)
		{
			if(i==1)
			{
			}
			else if (i==2||i==3||i==5||i==7) {
				System.out.print(" "+i);
			}
			else if (i%2!=0&&i%3!=0&&i%5!=0&&i%7!=0)
			{
				System.out.print(""+ i+" ");
			}
			
		}
		System.out.println();
		System.out.print(" all  non-prime numbers:");

		for(int i=1;i<=100;i++)
		{	
			if(i==1||i==2||i==3||i==5||i==7)
			{
			}
			else if (i%2==0||i%3==0||i%5==0||i%7==0)
			{
				System.out.print(i+" ");
			}
		}
	}
	}


