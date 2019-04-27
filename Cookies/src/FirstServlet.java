import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String name=req.getParameter("nm");
		Cookie ck= new Cookie("nmg",name);
		ck.setMaxAge(-1);
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<body bgcolor='green'>");
		out.print("<form action='SecondServelet'>");
		out.print("<html>");
		out.print("<input type='submit' value='NextServlet'>");
		out.print("</form>");
		out.print("</body>");
		out.print("</html>");
		out.flush();
		out.close();
		
		
	}
}
