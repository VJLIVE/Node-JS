import java.sql.*;

public class Update {
    public static void main(String args[]) {
        String id = "23911A1225";
        String pwd = "Vers";
        String newPwd = "Vers1";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
            Statement stmt = con.createStatement();
            // Updating database
            String q1 = "UPDATE userid set pwd = '" + newPwd + "' WHERE id = '" + id + "' AND pwd = '" + pwd + "'";
            int x = stmt.executeUpdate(q1);
            if (x > 0)
                System.out.println("Password Successfully Updated");
            else
                System.out.println("ERROR OCCURRED :(");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
