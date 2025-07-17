package Demo;

import java.sql.*;

public class Demo2 {
	public static void main(String[] args) throws Exception{
		String url ="jdbc:mysql://localhost:3306/aliens";
		String uname ="root";
		String password = "Bruno@123";
		
//		int userid = 5;
//		String name = "wrumwrum";
//		String query = "insert into student values ("+userid+",'"+name+"')"; 
		
		//using prepared statement
		int userid = 6;
		String name = "crumcrum";
		
		String query = "insert into student values (?,?)";
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,uname,password);
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, userid);
		st.setString(2, name);
		int count = st.executeUpdate();
		
		System.out.println(count + " row/s affected");
		 
		
		 
		st.close();
		con.close();
	}
}
