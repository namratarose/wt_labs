import javax.servlet.*;
import java.io.*;
public class FirstServlet implements Servlet
{
	ServletConfig conf;
	public void init(ServletConfig conf)
	{
		System.out.println("Servlet is initilized...");
		this.conf=conf;
	}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		System.out.println("Servlet is start");
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.println("<html><body>");
		pw.println("<h1> This is Servlet page..</h1>");
		pw.println("</body></html>");
	}
	public void destroy()
	{
		System.out.println("Servlet is going to destroy");
	}
	public ServletConfig getServletConfig()
	{
		return this.conf;
	}
	public String getServletInfo()
	{
		return "This servlet is create by united";
	}
}