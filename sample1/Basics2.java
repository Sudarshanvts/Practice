package sample1;
import java.util.Scanner;
public class Basics2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int c=1,i,count=0;
		Scanner s = new Scanner(System.in);
		c = s.nextInt();
		for(i=1;c!=0;c=c/10)
		{
			count++;
		}
		
		System.out.println(count);
	}
}
