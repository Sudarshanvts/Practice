package sudarshan;
import java.sql.*;
import java.util.Scanner;
public class jdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;
		try{ 
			//Oracle Driver
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			System.out.println("Connecting to a selected database...");
			//Oracle Connectivity
			conn = DriverManager.getConnection("jdbc:oracle:thin:@172.27.70.223:1521:ULS19C_PDB1","AZENTIO_TRAINING","AZENTIO123"); 
			
			System.out.println("Connected database successfully..."); 

			stmt = conn.createStatement(); 

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Rollnumber:");
			int rollno=sc.nextInt();
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter year");
			int year=sc.nextInt();

			System.out.println("Enter department");
			String department=sc.next();
			
			PreparedStatement pstmt = conn.prepareStatement ("insert into STUDENTS (ROLLNO,NAME,YEAR,DEPARTMENT) values (?, ?, ?,?)");
			pstmt.setInt (1, rollno);			
			pstmt.setString (2, name);
			pstmt.setInt (3, year);
			pstmt.setString (4, department);		
			
			pstmt.execute ();				
			
			System.out.println("\nDisplaying records present in the table...");
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM STUDENTS");
			while(rs.next())
				System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getInt(3)+" | "+rs.getString(4));
			
		}
		
		catch(Exception e) {
			System.out.println(e);
			
		}
	}

}