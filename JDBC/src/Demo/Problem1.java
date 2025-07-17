package Demo;

import java.sql.*;
import java.util.Scanner;

public class Problem1 {

    static final String DB_URL = "jdbc:mysql://localhost:3306/aliens";
    static final String DB_USER = "root";
    static final String DB_PASS = "Bruno@123";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Student Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: addStudent(scanner); break;
                case 2: viewStudents(); break;
                case 3: updateStudent(scanner); break;
                case 4: deleteStudent(scanner); break;
                case 5: 
                    scanner.close();
                    System.exit(0);
                default: 
                    System.out.println("Invalid choice.");
            }
        }
    }

    static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }

    static void addStudent(Scanner scanner) {
        try (Connection conn = getConnection()) {
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Age: ");
            int age = scanner.nextInt();

            String sql = "INSERT INTO Student VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.setString(2, name);
            stmt.setInt(3, age);
            stmt.executeUpdate();
            System.out.println("Student added.");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void viewStudents() {
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement()) {

            ResultSet rs = stmt.executeQuery("SELECT * FROM Student");
            System.out.println("ID\tName\tAge");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t" +
                                   rs.getString("name") + "\t" +
                                   rs.getInt("age"));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void updateStudent(Scanner scanner) {
        try (Connection conn = getConnection()) {
            System.out.print("Enter ID of student to update: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter New Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter New Age: ");
            int age = scanner.nextInt();

            String sql = "UPDATE Student SET name = ?, age = ? WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setInt(2, age);
            stmt.setInt(3, id);

            int rows = stmt.executeUpdate();
            if (rows > 0)
                System.out.println("Student updated.");
            else
                System.out.println("Student not found.");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void deleteStudent(Scanner scanner) {
        try (Connection conn = getConnection()) {
            System.out.print("Enter ID of student to delete: ");
            int id = scanner.nextInt();

            String sql = "DELETE FROM Student WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);

            int rows = stmt.executeUpdate();
            if (rows > 0)
                System.out.println("Student deleted.");
            else
                System.out.println("Student not found.");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
