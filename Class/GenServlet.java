import javax.servlet.*;
import java.util.*;
import java.io.*;
public class GenServlet extends GenericServlet
{
	
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		System.out.println("Servlet is start");
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.println("<html><body>");
		pw.println("<h1> This is Generic  Servlet page..</h1>");
		pw.println("<h1> Todays Date is</h1>"+new Date().toString());
		pw.println("</body></html>");
	}
	
}