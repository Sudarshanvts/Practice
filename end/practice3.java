package end;

class practice3 extends Thread
{
	public void run()
	{
		System.out.println("thread is running");
	}
	public static void main(String[] args)
	{
		practice3 t1=new practice3();
		t1.start();
	}

}
