package arr;
import java.util.Scanner;
public class arrmanipulate1
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int temp,size;		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		size = s.nextInt();	
		int a[]=new int[size];
		
		System.out.println("Enter the input values");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
			for(int i=0;i<size;i++)
			{
				for(int j=1;j<size;j++)
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}

				System.out.println(a[i]);
			}
		
	}

}
