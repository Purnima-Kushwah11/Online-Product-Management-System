package test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/admin")
public class AdminLoginServelet extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
	{
		PrintWriter pw=res.getWriter();
		String name = req.getParameter("uname");
		String password = req.getParameter("pword");
//		AdminLoginDAO dao= new AdminLoginDAO();
//		AdminBean login = dao.Login(name, password);
		
	AdminBean admin = new AdminLoginDAO().Login(name, password);
		
		if(admin==null)
		{
			pw.println("Invalid UName and Password!!!");
			req.getRequestDispatcher("home.html").include(req, res);
		}
		else
		{
			HttpSession session = req.getSession();
			session.setAttribute("bean", admin);
			RequestDispatcher rd = req.getRequestDispatcher("AdminLoginSuccess.jsp");
			rd.forward(req, res);
		
			
		}
		
	}

}
