package fullcourse;

public class Assignment_operator 
{
	public static void main(String [] args )
	{
		Assignment_operator x= new Assignment_operator();
		x.compare();
	}
	public  void override() {
		System.out.println("static method1");
	}
	public void compare()
	{
		int a=10,b=20;
		System.out.println("equal :\n"+( a==b));
		System.out.println("not equal :\n"+( a!=b));
		System.out.println("greter :\n"+( a>b));
		System.out.println("less : \n"+( a<b));
		System.out.println("greatre than equal:\n"+( a>=b));
		System.out.println("less than equal:\n"+( a<=b));
		
	}
}
