package evaluate;
import java.util.Scanner;
import java.math.*;
public class mindis 
{
  static int dis(String s,String w1,String w2)
	{
    	if(w1.equals(w2))
    	return 0;
	    String words[]=s.split(" ");
	    int mindis=(words.length)+1;
	    for(int i=0;i<words.length;i++)
		{
		 if(words[i].equals(w1))
		 {
		  for(int find=0;find<words.length;find++)
		  {
		   if(words[find].equals(w2))
		    {
		      int curr=Math.abs(i-find)-1;
		      if(curr<mindis)
			   {
			     mindis=curr;
			    }
		     }
		    }
		   }
	     }
	return mindis;
 }
   public static void main(String[]args)
    {
	
	  Scanner sub=new Scanner(System.in);
	  String s="Good persons experience good environment";
	  String w1="Good";
	  String w2="experience";
	  System.out.println(dis(s,w1,w2));
 }
}
