package logical_programs;
// caluculate series upto 5 
public class Fibbinnossi_series {
	int a = 0;
	int b=1;
	int c;
	
	public void fibbinno()
	{
		
		for(int i=1;i<=10;i++)
		{
			c=a+b;
			System.out.println(" "+a+" ");
			
			a=b;
			b=c;
			
		}
	}
	public static void main(String[] args) {
		Fibbinnossi_series f = new Fibbinnossi_series();
		f.fibbinno();
	}

}
