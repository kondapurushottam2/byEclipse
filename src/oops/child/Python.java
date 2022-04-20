package oops.child;

import oops.parent.Programming;

public class Python extends Programming {
	
	public void name() {
		System.out.println("python language ");
	}
	
	public void developer() {
		System.out.println("guido van rossum");
		
	}

	
	public void rank() {
		
		System.out.println(" first rank ");
	}

	
	public void difficulty_level() {
		
		System.out.println("easy");
	}

	
	public void uses() {
		System.out.println("data science,machine learning,web development");
		
	}

public static void main(String[] args) {
	Python p= new Python ();
	p.name();
	p.developer();
	p.difficulty_level();
	p.rank();
	p.uses();
}
	
}
