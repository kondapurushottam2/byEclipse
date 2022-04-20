package topicwisepractice;
import java.util.Scanner;
public class Switchcas 
{
	String bike;
	int range;
	int year_of_passing;
	
	public static void main(String [] args)
	{
		System.out.println("Enter bike name & your bugdet,passing year");
		Switchcas ref = new Switchcas ();
		ref.one();
		
	}
	public void one()

	{ 
		Scanner obj = new Scanner(System.in);
		String bike=obj.nextLine();
		int range=obj.nextInt();
		int year_of_passing=obj.nextInt();
		
		obj.close();
		switch (bike)
		{
		case "avenger": 
			if (range>=45000 && range<=55000)
			{ if (year_of_passing==2015)
			{
				System.out.println("red colour bike is available");
				System.out.println("you can buy avenger model 1");break;
			}
			else if (year_of_passing==2016)
			{ System.out.println("red colour bike is available");
			System.out.println("you can buy avenger model 1");break;
			}
			else if (range>=55000 && range<=65000)
			{ if (year_of_passing==2015)
			{
				System.out.println("red colour bike is available");
				System.out.println("you can buy avenger model 2");break;
			}
			else if (year_of_passing==2016)
			{ System.out.println("red colour bike is available");
			System.out.println("you can buy avenger model 2");break;
			}
			else if(range>=65000 && range<=70000)
			{ if (year_of_passing==2015)
			{
				System.out.println("red colour bike is available");
				System.out.println("you can buy avenger model 3");break;
			}
			else if (year_of_passing==2016)
			{ System.out.println("red colour bike is available");
			System.out.println("you can buy avenger model 3");break;
			}
			}
		/*	else  
			{ System.out.println("red colour bike is available");
			System.out.println("you can buy avenger ");break;
			}*/
			} }
			
			
			
		case "yamaha" : if (range>=45000 && range<=55000)
		{ if (year_of_passing==2015)
		{
			System.out.println("red colour bike is available");
			System.out.println("you can buy yamaha model 1");break;
		}
		else if (year_of_passing==2016)
		{ System.out.println("red colour bike is available");
		System.out.println("you can buy yamaha model 1");break;
		}
		else if (range>=55000 && range<=65000)
		{ if (year_of_passing==2015)
		{
			System.out.println("red colour bike is available");
			System.out.println("you can buy yamaha model 2");break;
		}
		else if (year_of_passing==2016)
		{ System.out.println("red colour bike is available");
		System.out.println("you can buy yamaha model 2");break;
		}
		else if (range>=65000 && range<=70000)
		{ if (year_of_passing==2015)
		{
			System.out.println("red colour bike is available");
			System.out.println("you can buy yamaha model 2");break;
		}
		else if (year_of_passing==2016)
		{ System.out.println("red colour bike is available");
		System.out.println("you can buy yamaha model 2");break;
		}
		}
		/*else  
		{ System.out.println("red colour bike is available");
		System.out.println("you can buy yamaha ");break;
		} */
		} }
		case "jupiter":if (range>=45000 && range<=55000)
		{ if (year_of_passing==2015)
		{
			System.out.println("red colour bike is available");
			System.out.println("you can buy jupiter model 3");break;
		}
		else if (year_of_passing==2016)
		{ System.out.println("red colour bike is available");
		System.out.println("you can buy jupiter model 3");break;
		}
		else if (range>=55000 && range<=65000)
		{ if (year_of_passing==2015)
		{
			System.out.println("red colour bike is available");
			System.out.println("you can buy jupiter model 1");break;
		}
		else if (year_of_passing==2016)
		{ System.out.println("red colour bike is available");
		System.out.println("you can buy jupiter model 1");break;
		}
		else if (range>=65000 && range<=70000)
		{ if (year_of_passing==2015)
		{
			System.out.println("red colour bike is available");
			System.out.println("you can buy jupiter model 2");break;
		}
		else if (year_of_passing==2016)
		{ System.out.println("red colour bike is available");
		System.out.println("you can buy jupiter model 2");break;
		}
		}
		else if (range>=70000 && range<=80000)
		{ if (year_of_passing==2015)
		{
			System.out.println("red colour bike is available");
			System.out.println("you can buy shine model 1");break;
		}
		else if (year_of_passing==2016)
		{ System.out.println("red colour bike is available");
		System.out.println("you can buy shine model 1");break;
		}
		}
		} }
		case "shine": 
			if (range>=45000 && range<=55000)
			{ if (year_of_passing==2015)
			{
				System.out.println("red colour bike is available");
				System.out.println("you can buy shine model 1");break;
			}
			else if (year_of_passing==2016)
			{ System.out.println("red colour bike is available");
			System.out.println("you can buy shine model 1");break;
			}
			else if (range>=55000 && range<=65000)
			{ if (year_of_passing==2015)
			{
				System.out.println("red colour bike is available");
				System.out.println("you can buy shine model 1");break;
			}
			else if (year_of_passing==2016)
			{ System.out.println("red colour bike is available");
			System.out.println("you can buy shine model 1");break;
			}
			else if (range>=65000 && range<=70000)
			{ if (year_of_passing==2015)
			{
				System.out.println("red colour bike is available");
				System.out.println("you can buy shine model 1");break;
			}
			else if (year_of_passing==2016)
			{ System.out.println("red colour bike is available");
			System.out.println("you can buy shine model 1");break;
			}
			}
			else if (range>=70000 && range<=80000)
			{ if (year_of_passing==2015)
			{
				System.out.println("red colour bike is available");
				System.out.println("you can buy shine model 1");break;
			}
			else if (year_of_passing==2016)
			{ System.out.println("red colour bike is available");
			System.out.println("you can buy shine model 1");break;
			}
			}
			} }
		default : System.out.println("sorry this type of bike is not available");break;
		}

	}		
}

