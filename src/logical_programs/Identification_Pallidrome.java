package logical_programs;
public class Identification_Pallidrome {
	
	int sum=0;

	public void pallidrome()
	{
		int n=121;
		int m= n;
		while(n!=0)
		{
			int rem=n%10;
			sum = sum*10 + rem;
			n/=10;
		}
		if (sum==m)
		{
			System.out.println( m+"  it is a pallidrome number ");
		}
	}
	public static void main(String[] args) {
		Identification_Pallidrome i = new Identification_Pallidrome();
		i.pallidrome();
	}

}
