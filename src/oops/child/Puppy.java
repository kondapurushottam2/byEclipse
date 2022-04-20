package oops.child;
import oops.parent.*;
public class Puppy extends Dog {
	
	public void bark()
	{
		System.out.println("PUPPY little bark");
	}
public static void main(String[] args) {
	Puppy p=new Puppy();
	p.bark();
	
	Dog d= (Dog)p;
	d.bark();
	
	Animals a= (Animals)d;
	a.bark();
	
}
}
