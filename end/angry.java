package end;

public class angry {

		public static void main(String[] args) 
		{
			try
			{
				System.out.println("Sudarshan");
				int num=100/0;
				System.out.println("Gokul");
			}			
			catch(ArithmeticException ex)
			{
				System.out.println("Tamil");
			}
			catch(Exception ex)
			{
				System.out.println("Tamil");
			}
			finally 
			{
				System.out.println("Jagu");
			}
						
	    }
}
