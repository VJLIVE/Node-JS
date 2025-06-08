import java.io.*;
import java.util.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

/**
 * Servlet implementation class SessionExample
 */
@WebServlet("/SessionExample")
public class SessionExample extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public SessionExample() {
        super();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(true);

        // print session info
        Date created = new Date(session.getCreationTime());
        Date accessed = new Date(session.getLastAccessedTime());
        out.println("<h3>Session Info:</h3>");
        out.println("ID: " + session.getId() + "<br>");
        out.println("Created: " + created + "<br>");
        out.println("Last Accessed: " + accessed + "<br><br>");

        // set session info if needed
        String dataName = request.getParameter("dataName");
        if (dataName != null && dataName.length() > 0) {
            String dataValue = request.getParameter("dataValue");
            session.setAttribute(dataName, dataValue);
        }

        // print session contents
        out.println("<h3>Session Attributes:</h3>");
        Enumeration<?> e = session.getAttributeNames();
        while (e.hasMoreElements()) {
            String name = (String) e.nextElement();
            String value = session.getAttribute(name).toString();
            out.println(name + " = " + value + "<br>");
        }

        // Form to set data
        out.println("<br><form>");
        out.println("Name: <input name='dataName'><br>");
        out.println("Value: <input name='dataValue'><br>");
        out.println("<input type='submit' value='Add to Session'>");
        out.println("</form>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}