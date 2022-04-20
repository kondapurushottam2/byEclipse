package logical_programs;

public class Identification_prime {
	int count=0;
	public void prime()
	{
		//System.out.print("list of prime number ");
		int n= 11;
		int m=n;
		for(int i=2;i<=(n-1);i++)
		{
			if(n%i==0)
			{
				count+=1;
			}
		}
		if(count==0)
		{
			System.out.println("it is a prime");
		}
	}
	public static void main(String[] args) {
		Identification_prime i = new Identification_prime();
		i.prime();
	}
}
