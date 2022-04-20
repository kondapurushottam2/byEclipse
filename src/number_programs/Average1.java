package number_programs;

import java.util.Scanner;

public class Average1
{
	public static void main (String [] args)
	{
		Average1 a=new Average1();
		a.aver();
	}
	public void aver() // a[] =  { } sum +=a[]  sum/n
	{	 
		double avg;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter how many numbers you want to calculate average");
		int n=obj.nextInt();
		int x=1,num=0;
		while(x<=n)
		{
			System.out.println("input number"+ "("+( x)+")" + ":");
			 num= num+obj.nextInt();
			x+=1;
		}
		 avg=(num/n);
		 System.out.println("average"+avg);
	}
}
