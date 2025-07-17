// Demo4.java
package Demo;

import java.sql.*;

public class Demo4 {

    public static void main(String[] args) throws Exception {
        int rollno = 1;
        String name = "";

        // 1. Load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. Connect to the database
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/aliens", "root", "Bruno@123");

        // 3. Prepare the stored procedure call
        CallableStatement cs = con.prepareCall("{ call getStudentNameById(?, ?) }");

        // 4. Set input param
        cs.setInt(1, rollno);

        // 5. Register output param
        cs.registerOutParameter(2, Types.VARCHAR);

        // 6. Execute
        cs.execute();

        // 7. Get output
        name = cs.getString(2);

        // 8. Display result
        System.out.println("Name of student with ID " + rollno + " is: " + name);

        // 9. Clean up
        cs.close();
        con.close();
    }
}
