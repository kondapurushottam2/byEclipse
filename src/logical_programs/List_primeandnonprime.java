package logical_programs;

public class List_primeandnonprime {
	
	public void list()
	{
		System.out.println("list of prime");
		for(int i=0;i<=500;i++)
		{
			if(i==1)
			{}
			else if (i==2||i==3||i==5||i==7)
			{
				System.out.println(i);
			}
			else if(i%2!=0&&i%3!=0&&i%5!=0&&i%7!=0)
			{
				System.out.println(i);
			}
		}
	}
	public void non_prime()
	{
		System.out.println("list of non-prime");
		for(int i=0;i<=500;i++)
		{
			if(i==1||i==0)
			{}
			else if (i==2||i==3||i==5||i==7)
			{
				
			}
			else if(i%2==0||i%3==0||i%5==0||i%7==0)
			{
				System.out.println(i);
			}
	}
	}
	public static void main(String[] args) {
		List_primeandnonprime l =new List_primeandnonprime();
		l.list();
		l.non_prime();
	}

}
