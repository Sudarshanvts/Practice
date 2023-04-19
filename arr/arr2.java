package arr;
import java.util.Scanner;
public class arr2
{
	public arr2() 
	{
		int count=0,size;		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		size = s.nextInt();		 
		int a[]=new int[size];
		
		System.out.println("Enter the input values");
		for(int i=0;i<size;i++)
		a[i] = s.nextInt();	
		for(int i=0;i<size;i++)
		count++;
			System.out.println(count);
		// TODO Auto-generated constructor stub
	}

}
