package work;


class template extends practice
{
	public void here()
	{
  
	  System.out.println("It governs whole country by oppointing state");
	  System.out.println("It allocates state govt to execute the constitution power");
	}
  
  
}
/*class stategovt extends centralgovt
{
	public void nonpower()
	{
		System.out.println("Currently in stategovt class");	
	}
}*/
class practice
{
  public static void main(String[] args)
  {
	  System.out.println("currently I am in main class");
	  template s=new template();
	  s.here();
   
  }
}