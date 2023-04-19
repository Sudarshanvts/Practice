package advance;
import java.util.*; 
import java.util.Scanner;

class workers
 {
boolean addemployee(String id)
{
	
}
	int id;
	String name;
	String address;
	int payslip;
    public workers(int id,String name,String address,int payslip)
   {
	this.id=id;
	this.name=name;
	this.address=address;
	this.payslip=payslip;
   }	
}
public class training5
{  
 public static void main(String args[])
 {   
  ArrayList<workers>List=new ArrayList<workers>();  	  
  workers a1=new workers(201,"Sudarshan","Perungudi",30000);
  workers a2=new workers(202,"Gokul","Sriperambadur",20000);
  workers a3=new workers(203,"Santhanam","Salem",20000);
  workers a4=new workers(204,"Tamil","Salem",10000);
  List.add(a1);  
  List.add(a2);  
  List.add(a3);  
  List.add(a4);  
  for(workers a:List)    
    System.out.println(a.id+" "+a.name+" "+a.address+" "+a.payslip+" ");  
  Scanner in=new Scanner(System.in);
  int id = in.nextInt(); 
  
 }  
}  
