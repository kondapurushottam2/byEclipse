 package number_programs;

public class Armstrong_number
{
	public static void main(String [] args)
	{
		Armstrong_number x=new Armstrong_number();
		x.palle();
	}
	public void palle()
	{
		int n=153,arm=0,c;// 153=1+125+27=153
		 c=n;
		while(n!=0)
		{
			int rem=n%10;
			arm+=(rem*rem*rem); // 
			n=n/10;
		}
		if(c==arm)
		{
			System.out.println(c+"  is a armstrong number");
		}
		else
		{
			System.out.println(c+"  is not a armstrong number");
		}
	}
}
