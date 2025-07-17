package Demo;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Correct class name
        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/VVCE_DB";
        String user = "root";
        String password = "Bruno@123";

        Connection con = DriverManager.getConnection(url, user, password);
        Statement st = con.createStatement();
        String query = "SELECT * FROM Student";
        ResultSet rs = st.executeQuery(query);

        while (rs.next()) {
            System.out.println("ID: " + rs.getInt(1) +
                               " Name: " + rs.getString(2) +
                               " City: " + rs.getString(3));
        }
        con.close();
    }
}
