package arr;
import java.util.Scanner;

public class arrmanipulate {

	public static void main(String[] args)
	{
		int arr[]= {31,32,33,34,35};
		System.out.println("printing the original array: ");
		for(int i:arr)
			System.out.println(i);

		System.out.println("printing the Cloned duplicate array: ");
		int carr[]=arr.clone();
		for(int i:carr)
			System.out.println(i);
		System.out.println("Equality of both the array values entered: ");		
		System.out.println(arr==carr);
	}

}
