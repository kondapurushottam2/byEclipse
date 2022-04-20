package topicwisepractice;

import java.util.Scanner;

public class Unary {
	public static void main(String[] args) {
		int a; // 10
		System.out.println("enter your number:");
		Scanner obj = new Scanner(System.in);
		a = obj.nextInt();
		System.out.println("pre/post increment:");
		System.out.println(++a); // 11 11 25 26 26
		System.out.println(a++); // 11 12 26 27 26
		System.out.println("\n");
		System.out.println("pre/post decrement");
		System.out.println(--a); // 11 11 27 26 26
		System.out.println(a--); // 11 10 26 25 26
		System.out.println(a--); // 25 24 25
	}
}
