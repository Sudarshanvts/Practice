package advance;
import java.util.*; 
import java.util.Scanner;

 class employees
 {
	int id;
	String name;
	String address;
	int salary;
    public employees(int id,String name,String address,int salary)
   {
	this.id=id;
	this.name=name;
	this.address=address;
	this.salary=salary;
   }	
}
public class training4
{  
 public static void main(String args[])
 {   
  ArrayList<employees>List=new ArrayList<employees>();  	  
  employees a1=new employees(201,"Sudarshan","Perungudi",30000);
  employees a2=new employees(202,"Gokul","Sriperambadur",20000);
  employees a3=new employees(203,"Santhanam","Salem",20000);
  employees a4=new employees(204,"Tamil","Salem",10000);
  List.add(a1);  
  List.add(a2);  
  List.add(a3);  
  List.add(a4);  
  List.remove(a1);  
  for(employees a:List)    
    System.out.println(a.id+" "+a.name+" "+a.address+" "+a.salary+" ");  
  Scanner in=new Scanner(System.in);
  int id = in.nextInt();    
 }  
}  
