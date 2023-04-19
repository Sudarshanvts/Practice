package develop;
import java.util.Scanner;

class players 
{
	
	static void display(int a,int b)
	{
		System.out.println("The player is selected");
				
	}
	static void display1(int a,int b)
	{
		System.out.println("The player is Rejected");
		
	}
}

class volleyball extends players 
{
	public  void calculate(int age,int height)
	{
		int a,b;
		a=age;
		b=height;
		if((a>=16&&a<=30)&&(b>=180))
		{
			  display(a,b);
		}
		else
		{
		     display1(a,b);
		}
	}
	public static void volleyball(String[] args)
	{
		int age,height;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Experience of the player");
		
		System.out.println("Enter the age of the person: ");
		age = s.nextInt();
		System.out.println("Enter the height of the person: ");
		height =s.nextInt();
		calculate(age,height);
		
	}	

}

