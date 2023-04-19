package extra;

import java.sql.*;

public class testing

public static void main(String[] args)

{

try{

//step1 load the driver class

Class.forName("oracle.jdbc.driver.OracleDriver");

//step2 create the connection object

Connection con-DriverManager.getConnection( "jdbc:oracle:thin:@localhost:1521:xe", "system", "system");

//step3 create the statement object

Statement stmt=con.createStatement();

int age height:

//step4 execute query

ResultSet rs stmt.executeQuery("select from volleyball"):

while(rs.next())
 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getint(3)+" "+rs.getInt(4));

age=rs.getInt(3):

height=rs.getInt(4):

if((age>=16&&age<=30) && (height>=180))

System.out.println("The player is selected"):

else

System.out.println("The player is rejected");

//step5 close the connection object

con.close();

catch(Exception e){

System.out.println(e)