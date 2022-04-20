package oops.child;

import oops.parent.Programming;

public class Java extends Programming {
	public void name() {
		System.out.println("java language ");
	}
	
public void developer()
{
	System.out.println(" games gosling");
}


public void rank() {
	System.out.println(" second rank");
	
}


public void difficulty_level() {
	System.out.println("intermidiate");
	
}


public void uses() {
	System.out.println("web development,android development,software development etc");
	
}
public static void main(String[] args) {
	Java j= new Java();
	j.name();
	j.developer();
	j.difficulty_level();
	j.rank();
	j.uses();
}

}
