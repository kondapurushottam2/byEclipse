package topicwisepractice;

public class Vaccinationreport 
{

int people=100;
int age=25;
static int age1=15;
static int age2=68;
static int age3=52;

	public static void main(String []args)
	{
		
		Vaccinationreport obj = new Vaccinationreport();
		obj.maharashtra();
		goa();
		UP();
		delhi();
		
			}
	public void maharashtra()
	{
		System.out.println("we are people from maharashtra");
			if (age>= 0 && age<=18)
			{
				System.out.println("you are not elegible for vaccination");
				System.out.println("total childerns are 12 out of 100");
			}
			else if (age>=18 && age<=40)
			{
				System.out.println("total peoples are 37 out of 100");
			}
			else if (age>=40 && age<65)
			{
				System.out.println("total peoples are 40 out of 100");
			}
			else if (age2>=65 && age2<100)
			{
				System.out.println("total peoples are 40 out of 100 ");
			}
			
		}

	public static  void goa()
	{
		System.out.println("we are people from goa");
			if (age1>= 0 && age1<=18)
			{
				System.out.println("you are not elegible for vaccination");
				System.out.println("total childerns are 10 out of 100");
			}
			else if (age1>=18 && age1<=40)
			{
				System.out.println("total peoples are 20 out of 100");
			}
			else if (age1>=40 && age1<65)
			{
				System.out.println("total peoples are 40 out of 100");
			}
			else if (age2>=65 && age2<100)
			{
				System.out.println("total peoples are 40 out of 100 ");
			}
			
		}

	public static  void UP()
	{
		System.out.println("we are people from UP");
			if (age2>= 0 && age2<=18)
			{
				System.out.println("you are not elegible for vaccination");
				System.out.println("total childerns are 10 out of 100");
			}
			else if (age2>=18 && age2<=40)
			{
				System.out.println("total peoples are 20 out of 100");
			}
			else if (age2>=40 && age2<65)
			{
				System.out.println("total peoples are 40 out of 100");
			}
			else if (age2>=65 && age2<100)
			{
				System.out.println("total peoples are 40 out of 100 ");
			}
			
		}
	
	public static  void delhi()
	{
		System.out.println("we are people from delhi");
			if (age3>= 0 && age3<=18)
			{
				System.out.println("you are not elegible for vaccination");
				System.out.println("total childerns are 5 out of 100");
			}
			else if (age3>=18 && age3<=40)
			{
				System.out.println("total peoples are 26 out of 100");
			}
			else if (age3>=40 && age3<65)
			{
				System.out.println("total peoples are 8 out of 100");
			}
			else if (age3>=65 && age3<100)
			{
				System.out.println("total peoples are 67 out of 100 ");
			}
			
		}
	

}
