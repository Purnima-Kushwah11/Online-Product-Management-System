package test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/dis")
public class OrderPizza extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String name= req.getParameter("name");
		String top= req.getParameter("top");
		String free= req.getParameter("free");
		String add= req.getParameter("add");
		String visa= req.getParameter("visa");
		String pass = req.getParameter("pass");
		String pass1 = req.getParameter("pass1");
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		pw.println("Name: "+name+"<br>");
		pw.println("Topping: "+top+"<br>");
		pw.println("Free Appetize : "+free+"<br>");
		pw.println("Adress: "+add+"<br>");
		pw.println("Credit Card: "+visa+"<br>");
		pw.println("Credit Card Number: "+pass+"<br>");
		pw.println(" Repeat Credit Card Number: "+pass1+"<br>");	
		
	}

}
