import java.sql.*;
public class Delete
{
public static void main(String args[])
{
String id = "23911A1225"; String pwd = "Version";
 try
{
Class.forName("com.mysql.cj.jdbc.Driver"); 
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root"); 
Statement stmt = con.createStatement();
// Deleting from database
String q1 = "DELETE from userid WHERE id = '" + id + "' AND pwd = '" + pwd + "'";
int x = stmt.executeUpdate(q1); if (x > 0)
System.out.println("One User Successfully Deleted");
else
System.out.println("ERROR OCCURRED :(");

con.close();
}
catch(Exception e)
{
System.out.println(e);
 
}
}
}
