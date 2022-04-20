package practice;

public class Datatypespractice 
{
	public static void main(String [] args)
	{
		boolean a = true; // size=1 bit 
		byte b= 127; //size= -128 to 127
		char  c= '$';    // size= 2 byte= -32768 to 32767 
		short d = 32767; // size = -32768 to 32767
		int e = 2147483647; // size = 4 byte = -2147483648 to 2147483647
		long f = 32565414125l; // size= 8 byte
		float g=55.658f; // range is unlimited 
		double h = 25632548.2656d; // range is unlimited 
		System.out.println("boolean "+a +"\n "+ "byte  " +b+"\n"+ "char  "+c+"\n"+"short  "+d+"\n"+"int  "+e+"\n"+"long  "+ f+"\n"+"float  "+g+"\n"+"double  "+h);
	}

}
