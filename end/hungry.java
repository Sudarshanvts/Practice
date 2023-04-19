package end;

public class hungry 
{
	public static void main(String[] args)
	{
		try 
		{
		int data=50/0;
		System.out.println("Rest of the code");
		}
		
		catch(ArithmeticException ex)
		{
			System.out.println("B");
		}
		catch(Exception ex1)
		{
			System.out.println("A");
		}
		System.out.println("C");
	}

}
