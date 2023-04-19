package evaluate;
import java.util.Scanner;
import java.math.*;

public class numbers
{
	public static void main(String[] args) 
	{
		Scanner size=new Scanner(System.in);
		Scanner arr_values=new Scanner(System.in);
		System.out.println("Enter the array size between 3 to 100: ");
		System.out.println("Enter the integer vales from 1 to 100: ");
		System.out.println("Enter the size of the array: ");
		
	
		System.out.println("Enter the size of the array: ");
		Scanner in=new Scanner(System.in);
		int n=size.nextInt();
		 
		int arr[]=new int[n];
		int arr1[]=new int[n];
		int b=1;
		for(int i=1;i<n;i++)
		{
			arr[i] = in.nextInt();
			b*=arr[i];
		}		
		for(int i=1;i<n;i++)
		{
			arr1[i]=b/arr1[i];			
			System.out.println(arr[i]+" ");
		}		
	}
}
