package fullcourse;

public class Dtatype 
{	
	int a=10;
	static boolean b=true;
	static int c= 20;
	public static void main(String[] args)
	{
		Dtatype obj= new Dtatype();
		obj.second();
		
		
	}
	public void second()
	{
		int a = 15;
		System.out.println(this.a);
		double c = 152.5d;
		System.out.println(" "+ a+" "+ b+ " "+ c);
		System.out.println(this.c);
	}
}
