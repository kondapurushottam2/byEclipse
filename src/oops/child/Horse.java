package oops.child;

import oops.parent.Animals;

public class Horse extends Animals {

	public void living_place()
	{
		System.out.println("tabela");
	}
	public static void main(String[] args) {
		Animals a= new Animals();
		a.sleep();
		
		Horse h=new Horse();
		h.sleep();
		h.four_leg();
		h.bark();
		h.living_place();
		h.eat();
		h.eat();
		
	}
	
}
