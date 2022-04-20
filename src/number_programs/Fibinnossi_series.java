package number_programs;

public class Fibinnossi_series 
{
	public static void main(String [] args)
	{
		Fibinnossi_series obj=new Fibinnossi_series();
		obj.fibbino();
	}
	public void fibbino()
	{
		int a=0;
		int b=1; 
		int c;
		System.out.println(a+b); // 0 1 1 2 3 5 8 13 
		for(int i=1;i<=10;i++) {
			
		
			c=a+b;
		System.out.print(" "+c+" ");
		a=b;
		b=c;
	}
}
}
