import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
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
    	        out.println("<html>"); 
    	        out.println("<head>"); 
    	        out.println("<title>Hello World!</title>"); 
    	        out.println("</head>"); 
    	        out.println("<body>"); 
    	        out.println("<h1>Hello World!</h1>"); 
    	        out.println("</body>"); 
    	        out.println("</html>"); 
    	    } 

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
