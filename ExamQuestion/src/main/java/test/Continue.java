package test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/Display")
public class Continue extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		
		PrintWriter pw = res.getWriter();
		String name = req.getParameter("uname");
		int age= Integer.parseInt(req.getParameter("age"));
		long mobile = Long.parseLong(req.getParameter("mobile"));
		String degree= req.getParameter("degree");
		int year = Integer.parseInt(req.getParameter("year"));
		String university = req.getParameter("university");
		res.setContentType("text/html");
		pw.println("Name: "+name+"<br>");
		pw.println("Age: "+age+"<br>");
		pw.println("Mobile: "+mobile+"<br>");
		pw.println("Highest Degree: "+degree+"<br>");
		pw.println("Year Of Pass: "+year+"<br>");
		pw.println("University : "+university+"<br>");
		
		
		
	}

}
