package lab11-ServletDemo.src;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set response type
        response.setContentType("text/html");

        // Get writer object
        PrintWriter out = response.getWriter();

        // Reading request parameter
        String name = request.getParameter("username");

        // Sending response
        out.println("<html><body>");
        out.println("<h2>Hello " + name + "</h2>");
        out.println("<p>Request handled successfully!</p>");
        out.println("</body></html>");
    }
}