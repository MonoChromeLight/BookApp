import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HeaderSnoop extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException
	{
		resp.setContentType("text/plain"); 
		PrintWriter out = resp.getWriter(); 
		Enumeration names = req.getHeaderNames();
		while(names.hasMoreElements()) { 
			String name = (String)names.nextElement(); 
			String val = req.getHeader(name); 
			if( val != null ) { 
				out.println(name+":"+val ); 
			} 
		} 
	}
}
