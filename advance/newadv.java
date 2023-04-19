package advance;
import java.sql.*;

public class newadv {
public static void main(String[] args) 
{
Connection conn = null;
Statement stmt = null;
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("Connecting to a selected database...");
conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:","system","system");
System.out.println("Connected database successfully...");

System.out.println("Inserting records into the table...");
stmt = conn.createStatement();
String sql = "INSERT INTO WORKERS1" + "VALUES ('100', 'Zara','78000','2000')";
stmt.executeUpdate(sql);
sql = "INSERT INTO WORKERS1" + "VALUES ('101', 'Mahnaz','80000','5000')";
stmt.executeUpdate(sql);
sql = "INSERT INTO WORKERS1" + "VALUES ('102', 'Zaid','65000','1500')";

stmt.executeUpdate(sql);

sql = "INSERT INTO WORKERS1" + "VALUES('103', 'Sumit','70000','2000')";

stmt.executeUpdate(sql);

System.out.println("Inserted records into the table...");

}catch(SQLException se){

se.printStackTrace();

}catch(Exception e)
{

e.printStackTrace();



}finally{

try{

if(stmt!=null)

conn.close();

}catch(SQLException se){

}

try{

if(conn!=null)

conn.close();

}catch(SQLException se){

se.printStackTrace();

}//end finally try

}//end try

System.out.println("Goodbye!");

}//end main

}//end JDBCExample

