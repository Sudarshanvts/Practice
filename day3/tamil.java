package day3;
import java.io.*;

abstract class sanskrit
{
  public void display() 
  {
	System.out.println("Tamil is the ancient language than sanskrit");  
  }
}
public class tamil extends sanskrit
{

	public static void main(String[] args)
	{
		tamil obj=new tamil();
		obj.display();

	}

}
