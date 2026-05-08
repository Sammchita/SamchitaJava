import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set response type
        response.setContentType("text/html");

        // Get PrintWriter object to send response
        PrintWriter out = response.getWriter();

        // Read data from request (URL parameter)
        String name = request.getParameter("name");

        // Default value if no input is given
        if (name == null || name.equals("")) {
            name = "Guest";
        }

        // Write response to browser
        out.println("<html><body>");
        out.println("<h2>HTTP Request and Response Example</h2>");
        out.println("<p>Hello, " + name + "</p>");
        out.println("</body></html>");
    }
}
