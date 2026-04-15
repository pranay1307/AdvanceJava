// import java.sql.*;

// public class PrepainStatement {
//     public static void main(String[] args) {

//         String url = "jdbc:mysql://127.0.0.1:3306/students?useSSL=false&serverTimezone=UTC";
//         String username = "root";
//         String password = "Pranay@1307";

//         String query = "SELECT * FROM students WHERE course=?";
//         String insert = "INSERT INTO students(name,course,marks) VALUES(?,?,?)";

//         try (Connection con = DriverManager.getConnection(url, username, password)) {

//             // INSERT
//             PreparedStatement inpst = con.prepareStatement(insert);
//             inpst.setString(1, "Student7");
//             inpst.setString(2, "MCA");
//             inpst.setLong(3, 67);
//             inpst.executeUpdate();

//             // SELECT
//             PreparedStatement pst = con.prepareStatement(query);
//             pst.setString(1, "MCA");

//             ResultSet rs = pst.executeQuery();

//             System.out.println("ID\tName\t\tCourse\t\tMarks");

//             while (rs.next()) {
//                 System.out.println(
//                         rs.getInt("id") + "\t" +
//                         rs.getString("name") + "\t" +
//                         rs.getString("course") + "\t\t" +
//                         rs.getLong("marks")
//                 );
//             }

//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }

import java.sql.Connection;
import java.sql.DriverManager;

public class TestDB {
    public static void main(String[] args) {

        String url = "jdbc:mysql://127.0.0.1:3306/students?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = "Pranay@1307";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // 🔥 FIX

            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Connected successfully!");

        } catch (Exception e) {
            System.out.println("❌ Connection failed!");
            e.printStackTrace();
        }
    }
}