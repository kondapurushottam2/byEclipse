package topicwisepractice;

import java.util.Scanner;

public class Logicalop {
	public static void main(String[] args) {    /// 12 18 93 25 
		int a, b, c, d;
		System.out.println("Enter your numbers here ");
		Scanner obj = new Scanner(System.in);
		a = obj.nextInt();
		b = obj.nextInt();
		c = obj.nextInt();
		d = obj.nextInt();
		System.out.println("\n");
		System.out.println("logical AND "); // true if both conditions are true
		System.out.println((a > b) && (a < b));  
		System.out.println((a < b) && (a < b));
		System.out.println((a > b) && (a < b)); //
		System.out.println((a < b) && (a > b));
		System.out.println("\n");

		System.out.println("logical OR "); // true if any one condition is true
		System.out.println((c < d) || (c > d));
		System.out.println((c > d) || (c < d));
		System.out.println((a > b) || (a < b));
		System.out.println((a < b) || (a > b));
		System.out.println("\n");

		System.out.println("logical NOT "); // reverse of the result means true to false or vice versa
		System.out.println(!(c > d));
		System.out.println(!(a < b));
		System.out.println(!(c < d));
		System.out.println(!(a > b));

	}
}
