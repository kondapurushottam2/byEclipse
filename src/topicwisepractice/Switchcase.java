package topicwisepractice;

public class Switchcase {
	public void bikeselection()
	{
	    int price = 55000;
		switch (price)
		{
		case 55000:  if (price>=50000 && price<=60000)
		{
			System.out.println("unicorn");
		} 
		break;
		case 60000: ////if (price>=60000 && price<=70000)
		{
		    System.out.println(" shine");
		}
		break;
		case 75000://// if (price>=70000 && price<=80000)
		{
			System.out.println("avenger");
		} 
		break;
		case 85000:// if (price>=80000 && price<=90000)
		{
			System.out.println("ktm");
		} 
		break;
		
}
	}
		
		public static void main(String [] args)
		{
			Switchcase ref = new Switchcase();
			ref.bikeselection();
		}
}
