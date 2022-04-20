package oops.child;

import oops.parent.Programming;

public class C_language extends Programming {
	
	public void name() {
		System.out.println("C  language ");
	}

	@Override
	public void developer() {
		System.out.println("dennis m. ritchie");
		
	}

	@Override
	public void rank() {
		System.out.println(" third rank");		
	}

	@Override
	public void difficulty_level() {
		System.out.println("intermediate to difficult");
		
	}

	@Override
	public void uses() {
		System.out.println("dundamental of cs");
		
	}

public static void main(String[] args) {
	C_language j= new  C_language();
	j.name();
	j.developer();
	j.difficulty_level();
	j.rank();
	j.uses();
}

	
	
}
