package Demo;

import java.sql.Statement;  
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

class StudentDAO{
	public Student getStudent(int rollno) throws Exception {
		
		String query = "select name from student where id ="+rollno;
		Student s = new Student();
		s.rollno = rollno;
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aliens","root","Bruno@123");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		if (rs.next()) {
            s.sname = rs.getString("name"); 
        }
		
		rs.close();
        st.close();
        con.close();
		return s;
	}
}

class Student{
	int rollno;
	String sname;
}

public class Demo3 {
	public static void main(String[] args) throws Exception{
		StudentDAO dao = new StudentDAO();
		Student s1 = dao.getStudent(1);
		System.out.println(s1.sname);
	}
}
