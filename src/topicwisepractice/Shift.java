package topicwisepractice;

//import java.util.Scanner;

public class Shift {
	public static void main(String[] args) {
		int a = 8;
		// System.out.println("enter your number:");
		// Scanner obj = new Scanner(System.in);
		// a=obj.nextInt();

		int b = a >> 2; // a=8 1000.00    1 .0 0 0 
		System.out.println("value in b:" + b); // 10 b=2
		b = a << 3;  ///  1 0 0 0 0 0 0
		System.out.println("value in b:" + b); // 100000 b=32

	}
}
