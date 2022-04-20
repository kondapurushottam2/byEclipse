package reverse_String;

public class Using_Stringbuffer {
	public static void main(String[] args) {
		Using_Stringbuffer x= new Using_Stringbuffer();
		x.rev();
		x.rev1();
	}
	public void rev()
	{
		String str = "ABCDE";
		//String rev= "";
		
		StringBuffer sb = new StringBuffer(str);
		
		System.out.println(sb.reverse());
	}
	public void rev1()
	{    
		String str = "ABCDE";
		StringBuilder x = new StringBuilder(str);
		System.out.println(x.reverse());
	}

}

