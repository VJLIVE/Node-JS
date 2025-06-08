import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.http.Cookie;

/**
 * Servlet implementation class CookieExample
 */
@WebServlet("/CookieExample")
public class CookieExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieExample() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
    	    throws IOException, ServletException 
    	    { 
    	        response.setContentType("text/html"); 
    	        PrintWriter out = response.getWriter(); 

    	        // Print out cookies 
    	        Cookie[] cookies = request.getCookies(); 
    	        if (cookies != null) {
    	            for (int i = 0; i < cookies.length; i++) { 
    	                Cookie c = cookies[i]; 
    	                String name = c.getName(); 
    	                String value = c.getValue(); 
    	                out.println("<p>" + name + " = " + value + "</p>"); 
    	            } 
    	        }

    	        // Set a cookie 
    	        String name = request.getParameter("cookieName"); 
    	        if (name != null && name.length() > 0) { 
    	            String value = request.getParameter("cookieValue"); 
    	            Cookie c = new Cookie(name, value); 
    	            response.addCookie(c); 
    	        } 

    	        // Simple HTML form for setting cookies
    	        out.println("<form>");
    	        out.println("Cookie Name: <input name='cookieName'><br>");
    	        out.println("Cookie Value: <input name='cookieValue'><br>");
    	        out.println("<input type='submit' value='Set Cookie'>");
    	        out.println("</form>");
    	    } 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
