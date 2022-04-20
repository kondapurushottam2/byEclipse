package logical_programs;

public class Reverse_string {
	
	String str = "ABCD";
	String rev = " ";
	public void rev_lenght()
	{
		int l = str.length();
		for(int i=(l-1);i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println( rev);
	}
	public static void main(String [] args)
	{
		Reverse_string r = new Reverse_string();
		r.rev_lenght();		
		r.by_stringbuffer();
		r.by_stringbuilder();
	}
	public void by_stringbuffer()
	{
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}
	public void by_stringbuilder()
	{
		StringBuilder s = new StringBuilder(str);
		System.out.println(s.reverse());
	}

}
