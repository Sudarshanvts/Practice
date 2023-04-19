package advance1;
interface Sayable
{  
    public String say(String name);  
}  
  
public class training3
{  
    public static void main(String[] args) 
    {  
        Sayable s1=(name)->
        {  
            return "Welcome "+name;  
        };
        System.out.println(s1.say("Azentio"));            
        Sayable s2= name ->
        {  
            return "Welcome "+name;  
        };  
        System.out.println(s2.say("Gokul"));  
    }  
 }  