package oops.child;

import oops.parent.Animals;

public class Dog extends Animals{
	

	public void bark()
	{
		System.out.println("DOG big  bark");
	}
	public static void main(String[] args) {
		
		Dog d=new Dog();
		d.bark();
		d.sleep();
		d.eat();
		d.run();
	}
}
