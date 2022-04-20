package logical_programs;

public class List_pallidrome {

	int sum;
	public void list()
	{
		for (int i=0;i<=1000;i++)
		{
			int n=i;
			while(n!=0)
			{
				int rem = n%10;
				 sum = sum *10+ rem;
				 n/=10;
			}
			if(sum==i)
			{
				System.out.println(i);
			}
			sum=0;
		}
	}
	public static void main(String[] args) {
		List_pallidrome l = new List_pallidrome();
		l.list();
	}
}
