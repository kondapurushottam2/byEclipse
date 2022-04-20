package number_programs;

public class List_armstrong_number 
{
	public static void main(String [] args)
	{
		List_armstrong_number x=new List_armstrong_number();
		x.armstrong();
		x.second();
		
	}
	public void armstrong()
	
	{
		  
		        int n, b,  sum = 0;
		        System.out.println("Armstrong numbers from 1 to 1000:");
		        for(int i = 1; i <= 1000; i++)
		        {
		            n = i;
		            while(n > 0)
		            {
		                b = n % 10;
		                sum = sum + (b * b * b);
		                n = n / 10;
		            }
		            if(sum == i)
		            {
		                System.out.println(i);
		            }
		           
		            sum = 0;
		        }
		    }
	
	public void second()
	{
		int sum=0,n,d;
		System.out.println("armstrong numbers in 1100 yo 2000");
		for(int i=1100;i<2000;i++)
		{
			n=i;
			while(n!=0)
			{
				 d=n%10;
				sum=sum+(d*d*d*d);
				n=n/10;
			}
			if(sum==i)
			{
				System.out.println(i+"  ");
			}
			sum=0;
		}
	}
	}
		

