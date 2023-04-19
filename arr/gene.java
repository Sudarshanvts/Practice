
package arr;
import java.util.Scanner;
class Genericgene
{
	public static <E>void printArray(E[]inputArray)
	{
		for(E element:inputArray)
		{
			System.out.printf("%s",element);
		}
		System.out.println();
	}

	public static<E extends Comparable<E>>E max(E[]a)
	{
		int i,j;
	
		E temp;
		for(i=0;i<a.length;i++)
			for(j=i+1;j<a.length;j++)
				
			if(a[i].compareTo(a[j])>0)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		return (a[a.length-1]);
	 }
	public static void main(String[]args)
	{
		Integer[]intArray= {10,1,2,5,3,4};
		Double[]doubleArray= {1.2,2.3,3.4,4.5,5.6,6.7,7.8,8.9,9.0};
		Character[]charArray= {'H','E','L','L','O'};
		System.out.print("Given integer array is: ");
		printArray(intArray);
		System.out.print("Given Double array is: ");
		printArray(doubleArray);
		System.out.print("Given Character array is: ");
		printArray(charArray);
		System.out.print("Maximum of integer array is: "+max(intArray));
		System.out.print("Maximum of Double array is: "+max(doubleArray));
		System.out.print("Maximum of Character array is: "+max(charArray));

	}
		
}
