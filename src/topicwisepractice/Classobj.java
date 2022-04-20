package topicwisepractice;

public class Classobj {

	static int a = 50; // shared across all instance/object
	int b = 20; // unique for each object

	public static void main(String[] args) {
		Classobj x = new Classobj();
		x.tell();
		ask();
	}

	public static void ask() {
		Classobj abc = new Classobj();
		System.out.println(abc.b);
		System.out.println(abc.a);
	}

	public void tell() {
		ask();
		Classobj g = new Classobj();
		System.out.println(g.a);
		System.out.println(g.b);
		a = 10;
		g.b = 40;
		System.out.println("g.a " + g.a);
		System.out.println("a " + a);

		System.out.println("g.b " + g.b);
		System.out.println("b " + b);
	}

}