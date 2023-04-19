package evaluate;
import java.util.Scanner;

public class wordings 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		char []word=new char[100];
	    word=s.toCharArray();
	    int count=0;
	    int k=s.length()-1;
		for(int i=0;i<s.length();i++)
			for(int j=0;j<s.length();j++)
			{
				if(!(i==k))
					System.out.print(word[i]);
				for(int x=0;x<s.length()-count;x++)
					System.out.print(" ");
				System.out.println(word[k]);
				k--;
				count++;
				break;
			}
		     for(int j=0;j<count;j++)
		    	 System.out.print(" ");
		     
	       }
}
