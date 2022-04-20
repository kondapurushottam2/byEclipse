package oops.parent;

class Pulsar extends Bike {

	public void slogan()
	{
		System.out.println("slogan as per PULSAR");
	}
	public void model()
	{
		System.out.println(" model as per PUSAR");
	}
	public void colour()
	{
		System.out.println("no colour AS PER PUSAR");
	}
	public void pulsa()
	{
		System.out.println("child specific method");
	}
	public static void main(String[] args) {
		Pulsar p = new Pulsar();
		p.slogan();
		p.model();
		p.colour();

		Bike b = new Bike();
		b.slogan();
		b.model();
		b.colour(); 
		Bike c = new Pulsar();
		c.slogan();
		c.model();
		c.colour(); 

		Pulsar v = (Pulsar) c ; 
		v.slogan();
		v.model();
		v.colour();
		v.pulsa();

	}

}
