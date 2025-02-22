package test;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/cal")
public class CheckNumber extends GenericServlet 
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		String sb= req.getParameter("sb");
		if(sb.equals("Prime"))
		{
			RequestDispatcher rd = req.getRequestDispatcher("Prime");
			rd.forward(req, res);
		}
		else if(sb.equals("Palindrome No"))
		{
			RequestDispatcher rd = req.getRequestDispatcher("Palindrome No");
			rd.forward(req, res);
		}
		else if(sb.equals("Armstrong No"))
		{
			RequestDispatcher rd = req.getRequestDispatcher("Armstrong No");
			rd.forward(req, res);
		}
		else
		{
			RequestDispatcher rd = req.getRequestDispatcher("Perfect No");
			rd.forward(req, res);
		}
		
	}

}
