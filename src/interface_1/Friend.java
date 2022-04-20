package interface_1;

public interface Friend {
	int a=10;
	default void second()
	{
		secret();
		System.out.println("default method");
	}
	public static void pk()
	{
		System.out.println("stastic method");
	}
	private void secret()
	{
		System.out.println("private method");
	}
	public static void main(String[] args) {
		
		
		System.out.println("interface");
	}
	 void noncomplete();
	 

}
