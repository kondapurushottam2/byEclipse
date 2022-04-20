package interface_1;

public class Concrete extends Frien
{

	@Override
	public   void noncomplete() {

		System.out.println("concrete method");
	}
	public static void main(String[] args) {
		System.out.println(a);
		
		Friend.pk();
		
		Concrete x= new Concrete();

		x.second();
		
		x.noncomplete();
		
		x.one();
		
	}
	
	
}
