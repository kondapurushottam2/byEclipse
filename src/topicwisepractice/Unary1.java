package topicwisepractice;

public class Unary1 {
	public static void main(String [] args)
	{
		int a= -10;
		
		System.out.println(++a);  // -9 -9
		System.out.println(a--);   // -9 -10
		System.out.println(++a);   //-9   -9
		System.out.println(+a);      // -9
		System.out.println(a--);/// -9 -10
		System.out.println(-a);//10  -10
		System.out.println(a--);   // -10    -11
		System.out.println(a);
		
	}
	
	//  -9
	// -9 -10 -9 +9 -10 10 10 9
	// -9 -9 -9 -9 - 9 10 -10 -11 
	
	
	
	
}
