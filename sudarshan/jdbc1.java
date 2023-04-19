package extra;
import java.sql.*;
import java.util.*;
public class TESTED 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of players in the selection list: ");
		int n=sc.nextInt();
		try 
		{
		    Class.forName("oracle.jdbc.driver.OracleDriver");
		    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@172.27.70.223:1521:ULS19C_PDB1","AZENTIO_TRAINING","AZENTIO123");
		   System.out.println("......");
		    for(int i=0;i<n;i++)
		    {
			System.out.println("Enter pl2ayer age:");
			int age=sc.nextInt();
			System.out.println("enter name");
			String name=sc.next();
			System.out.println("enter player height:");
			int height=sc.nextInt();
			if((age>=16&&age<=30)||(height>=180))
			{
				PreparedStatement pstmt = con.prepareStatement ("insert into GAMES (NAME,AGE,HEIGHT) values (?, ?, ?)");
				pstmt.setString (1, name);
				pstmt.setInt (2, age);
				pstmt.setInt (3, height);
				pstmt.execute ();
			pstmt.close();
			}
            con.close();
		    }
		}
			catch(Exception e){ System.out.println(e);}
				try 
				{
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection con=DriverManager.getConnection("jdbc:oracle:thin:@172.27.70.223:1521:ULS19C_PDB1","AZENTIO_TRAINING","AZENTIO123");
					Statement stmt=con.createStatement();
					ResultSet rs=stmt.executeQuery("select * from GAMES");
					while(rs.next())
					System.out.println(rs.getString(2)+" is selected ");
					con.close();
				}
				catch(Exception e){ System.out.println(e);}
	}
}
