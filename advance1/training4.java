package advance1;
import java.util.ArrayList;  
import java.util.Collections;  
import java.util.List;  
class Product
{  
	int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price)
    {  
        super();
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  
public class training4{  
    public static void main(String[] args)
    {  
        List<Product> list=new ArrayList<Product>();  
          
        list.add(new Product(1,"Skull candy Headphones",2000));  
        list.add(new Product(2,"Zebronics Accessories",1500));  
        list.add(new Product(3,"Samsung Mobiles",30000));            
        System.out.println("Sorting on the basis of name....");          
        Collections.sort(list,(p1,p2)->
        {
        return p1.name.compareTo(p2.name);
        });  
        for(Product p:list){  
            System.out.println(p.id+" "+p.name+" "+p.price);  
        }  
  
    }  
}  