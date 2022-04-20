package number_programs;

import java.util.Scanner;

public class Pallidrome1 
{
	public static void main(String []args)
	{
		Pallidrome1 obj=new Pallidrome1();
		obj.number();
	}
	public void number()
	{
		
	/*  Scanner x=new Scanner(System.in);
	  System.out.println("enter your  number");
	   int n=x.nextInt();*/
	   
	 
	  //121
	   int sum=0;
	   for(int i=0;i<=500;i++)
	   {
		   int m=i; 
	   
	   while(m!=0)
	   {
		   int d=m%10; // 1,2,1
		   sum=sum*10+d;// 1,10+2,120+1
		   m=m/10; //12,1,0
				   
	   }
	   if (i==sum)
	   {
		   System.out.println(i+" is a pallendrome number");
	   }
	  sum=0;
	}
	}
}
