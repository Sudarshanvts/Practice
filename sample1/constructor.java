package sample1;
import java.util.*;

public class constructor {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int i=1,v,value;
		Scanner f= new Scanner(System.in);
		value=f.nextInt();
		while(i<=value)
		{
			v=i*2;
			System.out.println(v);
			i++;
		}
	}
}
