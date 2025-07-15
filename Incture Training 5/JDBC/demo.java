package JDBC;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class demo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");


        String url = "jdbc:mysql://localhost:3306/VVCE_DB";

        String user_name = "root";
        String password = "Bruno@123";
        Connection con = DriverManager.getConnection(url, user_name, password);

        if(con != null){
            System.out.println("contion done");
        }
        else
        System.out.println("wrong");

        // Statement st = con.createStatement();

        // String query = "select * from Student";
        // ResultSet rs = st.executeQuery(query);

        // while(rs.next()){
        //     System.out.println("ID: " +rs.getInt(1)+"Name :"+rs.getString(2)+" City :"+rs.getString(3));
        // }        
        // con.close();

     }
}
