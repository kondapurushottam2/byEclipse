package topicwisepractice;

import java.util.Scanner;

public class Ternary {
	public static void main(String[] args) {
		int a, b, c, max, MAX;
		System.out.println("Enter numbers...");
		Scanner obj = new Scanner(System.in);
		a = obj.nextInt();
		b = obj.nextInt();
		c = obj.nextInt();

		max = (a > b ? a : b); // compare in a & b   
		//System.out.println("maximum value in a & b: " + max + "\n");

		MAX = (a > b) ? (a > c ? a : c) : (b > c ? b : c); // compare in a , b , c
		System.out.println("maximum value in a b c:  " + MAX + "\n");
	}

}
