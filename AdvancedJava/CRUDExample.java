import java.sql.*;

public class CRUDExample {
    public static void main(String[] args) {
        try {
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish Connection
            Connection con = DriverManager.getConnection(
             "jdbc:mysql://localhost:3306/college", "root", "MERO@ms321");

            System.out.println("Connected to database!");

            // 3. INSERT
            String insertQuery = "INSERT INTO student VALUES (1, 'Ram')";
            Statement stmt = con.createStatement();
            stmt.executeUpdate(insertQuery);
            System.out.println("Record Inserted!");

            // 4. SELECT
            String selectQuery = "SELECT * FROM student";
            ResultSet rs = stmt.executeQuery(selectQuery);

            System.out.println("Records:");
            while(rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
            }

            // 5. UPDATE
            String updateQuery = "UPDATE student SET name='Shyam' WHERE id=1";
            stmt.executeUpdate(updateQuery);
            System.out.println("Record Updated!");

            // 6. DELETE
            String deleteQuery = "DELETE FROM student WHERE id=1";
            stmt.executeUpdate(deleteQuery);
            System.out.println("Record Deleted!");

            // Close connection
            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}