package arr;
import java.util.Scanner;
public class arrays 
{
	public static void main(String[] args)
	{
		int size;		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		size = s.nextInt();		 
		int a[]=new int[size];
		
		System.out.println("Enter the input values");
		for(int i=0;i<size;i++)
		a[i] = s.nextInt();		  
		
		for(int i=0;i<size;i++)
			System.out.println("The given input array values are: "+a[i]);
		
		// TODO Auto-generated method stub

	}

}
