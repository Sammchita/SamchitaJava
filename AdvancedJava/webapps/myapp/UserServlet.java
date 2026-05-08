import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.sql.*;

public class UserServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get form data
        String name = request.getParameter("name");
        String email = request.getParameter("email");

        try {

            // Load MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Database connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb",
                "root",
                "MERO@ms321"
            );

            // Insert query
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO users(name, email) VALUES(?, ?)"
            );

            ps.setString(1, name);
            ps.setString(2, email);

            int i = ps.executeUpdate();

            if(i > 0) {
                out.println("Data inserted successfully!");
            }

            con.close();

        } catch(Exception e) {
            out.println(e);
        }
    }
}