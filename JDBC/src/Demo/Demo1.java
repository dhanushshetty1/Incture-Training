package Demo;

import java.sql.*;

public class Demo1 {
	public static void main(String[] args) throws Exception{
		String url ="jdbc:mysql://localhost:3306/aliens";
		String uname ="root";
		String password = "Bruno@123";
		String query = "select name from student where id = 3";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		 
		rs.next();
		String name = rs.getString(1);
		System.out.println(name);
		 
		String username ="";
		 
		while(rs.next()) {
			username = rs.getInt(1)+" : "+rs.getString(2);
			System.out.println(username);
		}
		 
		st.close();
		con.close();
	}
}
