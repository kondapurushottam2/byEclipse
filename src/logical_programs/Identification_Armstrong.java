package logical_programs;

import java.security.DomainCombiner;

public class Identification_Armstrong {
	int sum=0;
	public void armstrong()
	{
		int n= 153;
		int m=n;
		while(n!=0)
		{
			int rem=n%10;
			sum = sum+ (rem*rem*rem);
			n/=10;
			
		}
		if(sum==m)
		{
			System.out.println("it is a armstrong number ");
		}
		else
		{
			System.out.println("it is not a armstrong number ");
		}
	
		
	}
	public static void main(String[] args) {
		Identification_Armstrong i = new Identification_Armstrong();
		i.armstrong();
		
	}

}
