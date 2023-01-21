package servletFib;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class Authentification implements Filter{


	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		
		String user= arg0.getParameter("login");
		String pwd= arg0.getParameter("pass");
		String login= "admin";
		String password = "admin";
		if(user.equals(login) && pwd.equals(password))
			arg2.doFilter(arg0, arg1);;
	}

}
