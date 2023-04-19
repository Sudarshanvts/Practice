import day3.P;
import day3.Q;
import day3.R;

interface P
{
	String p="pppp";
	String method();
}
interface Q extends P
{
	String q="QQQQ";
	String methodQ();
}
class R implements P,Q
{
	public String methodp()
	{
		return q+p;
		
	}
	public String methodQ()
	{
		returnp+q;
	}
	public String methodQ()
	{
		return p+q;
	}
}
public class errors
{
	public static void main(String[]args)
	{
		R r=new R();
		System.out.println(r.methodP());
		System.out.println(r.methodQ());
		
	}
}