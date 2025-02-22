package test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/dim")
public class Validate extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String name = req.getParameter("name");
		String pass= req.getParameter("pass");
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		if(name.equals("Punam")&&pass.equals("12345"))
		{
			req.setAttribute("name", name);
			RequestDispatcher rd = req.getRequestDispatcher("Display.jsp");
			rd.forward(req, res);
		}
		else
		{
			pw.println("Invalid Username and Password");
			RequestDispatcher rd= req.getRequestDispatcher("Index.html");
			rd.include(req, res);
		}
		
		
		
	}

}
