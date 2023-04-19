package source;

class Train_details
{
	int train_id;
	String arrival_time,departure_time;
	Train_details(int a,String b,String c)
	{
		this.train_id=a;
		this.arrival_time=b;
		this.departure_time=c;		
	}
	void display()
	{
		System.out.println(train_id+arrival_time+departure_time);
	}

	
	public static void main(String[] args) 
	{
		Train_details T=new Train_details(1234,"01:00","06:00");
		T.display();
	}
}
	

