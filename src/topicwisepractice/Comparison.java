package topicwisepractice;

import java.util.Scanner;

public class Comparison {

	public static void main(String[] args) {
		int a, b;
		System.out.println("Enter any two number for comaprison..");
		Scanner obj = new Scanner(System.in);
		a = obj.nextInt();
		b = obj.nextInt();
		System.out.println("\n");

		System.out.println(a == b); // check for equality of two values if equal then true
		System.out.println(a != b); // check for two values are not equal if not equal then true
		System.out.println(a < b); // condition meet then true
		System.out.println(a > b);
		System.out.println(a <= b); // true if any one condition is correct
		System.out.println(a >= b); // true if any one condition is correct
	}
}
