
interface A
{
	void myMethod();
	class B
	{
		public void myMethod()
		{
			System.out.println("My method");
		}
	}
class c extends B implements A
{ }
class err1
{
	public static void main(String[]args)
	{
		A a=new c();
		a.myMethod();
	}
 }
