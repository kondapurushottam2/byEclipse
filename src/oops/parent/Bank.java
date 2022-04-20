package oops.parent;

public class Bank {
	
	public static void main(String [] args)
	{
		Bank a= new Bank();
		a.saving_Account();
		a.saving_Account(630,"purushottam");
	}

	public void saving_Account(int accounts,String name)
	{
		accounts= 520;
		System.out.println("purushottam");
	}
	public void current_account()
	{
		
	}
	public void saving_Account()
	{
		System.out.println("konda");
	}
	
}
