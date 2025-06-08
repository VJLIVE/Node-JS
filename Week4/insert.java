import java.sql.*;
public class insert
{
public static void main(String args[])
{
String id = "23911A1225"; 
String pwd = "Vers";
String fullname = "Vijay Guttula"; 
String email = "@vjit.ac.in";
try
{
Class.forName("com.mysql.cj.jdbc.Driver"); 
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root"); 
Statement stmt = con.createStatement();
// Inserting data in database
String q1 = "insert into userid values('" +id+ "', '" +pwd+ "', '" +fullname+ "', '" +email+ "')";
int x = stmt.executeUpdate(q1); if (x > 0)
System.out.println("Successfully Inserted"); else
System.out.println("Insert Failed");
con.close();
}
catch(Exception e)
{
System.out.println(e);
}
}
}
