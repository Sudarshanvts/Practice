package day2;
import java.io.*;

class parent
{
	int actions=20;
	int nature=50;
}
class inheri extends parent
{
	int extras=30;
     public static void main(String[] args)
		{
			inheri son=new inheri();
			inheri daughter=new inheri();
						
			System.out.println(son.nature);
			System.out.println(daughter.actions);

		}

	}



