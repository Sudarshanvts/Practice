package advance1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class training2
{  
    public static void main(String[] args)
    {  
    	int inp;
    	Scanner s=new Scanner(System.in);
    	inp = s.nextInt();
    	List<Integer>numberList=Arrays.asList(inp);
    	numberList.stream().filter(n->n%2!=0).forEach(System.out::println);
    	
    	
    }  
}  