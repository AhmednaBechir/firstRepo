package servletFib;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.*;

public class servletFib extends HttpServlet{
	int rangFib;

	public void init(ServletConfig config) throws ServletException {
		
		super.init(config);
		
		rangFib = Integer.parseInt(config.getInitParameter("rangeFib"));
		
	}
	
	public void service (HttpServletRequest req, HttpServletResponse rep) throws IOException {
		rep.setContentType("text/html");
		PrintWriter out = rep.getWriter();
		out.println("<HTML>");
		out.println("<HEAD><TITLE>Servlet Fibonacci</TITLE></HEAD>");
		out.println("<BODY>");
		out.println("<H1>Fib("+rangFib+") = "+fib(rangFib)+"</H1>");
		out.println("</BODY>");
		out.println("</HTML>");
		out.close();
	}

	public int fib(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return fib(n-1)+fib(n-2);
	}

	
}
