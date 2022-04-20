package interface_1;

import java.util.Scanner;

public  class Arithmatic implements Arithmatic_operation {

	
	Arithmatic()
	{
		super();
		System.out.println("All arithmatic operations..");
	}
	Scanner s= new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	
	public void addition() {
		System.out.println("addition:"+ (a + b));
		
	}

	@Override
	public void substraction() {
		System.out.println("substraction:"+ (a - b));
		
	}

	@Override
	public void division() {
		System.out.println("division:"+ (a / b));
		
	}

	@Override
	public void multiplication() {
		System.out.println("multiplication:"+ (a * b));
		
	}

	@Override
	public void remainder() {
		System.out.println("remainder:"+ (a % b));
		
	}
	public static void main(String[] args) {
		Arithmatic_operation a= new Arithmatic();
		a.addition();
		a.substraction();
		a.multiplication();
		a.division();
		a.remainder();
		
	}
	
}
