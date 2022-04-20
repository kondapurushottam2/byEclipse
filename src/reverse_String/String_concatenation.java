package reverse_String;

public class String_concatenation {
	public static void main(String[] args) {
		String_concatenation x=new String_concatenation();
		x.reverse();
		x.rev();
		}
	public void reverse()
	{
		String s= "ABCDE";
		String rev="";
		int l = s.length();
		for(int i=(l-1);i>=0;i--)
				{
					rev = rev+(s.charAt(i));
				}
		System.out.println(rev);
	}

public void rev()
{
	String str= "ABCDE";
	String rev="";
	char a[] = str.toCharArray();
	int l = a.length;
	for (int i=(l-1);i>=0;i--)
	{
		rev=rev + a[i];
	}
	System.out.println(rev);
	}


}