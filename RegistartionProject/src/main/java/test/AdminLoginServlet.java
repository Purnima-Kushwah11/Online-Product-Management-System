package test;

import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	{
         try
         { 
        	 PrintWriter pw = res.getWriter();
	         	String name = req.getParameter("uname");
		        String password = req.getParameter("pword");
		
		        AdminDAO ad = new AdminDAO();
		        AdminBean bean = ad.Login(name, password);
		        if(bean==null)
		         {
		        	pw.println("Login Failed");
		        	RequestDispatcher rd = req.getRequestDispatcher("AdminLogin.html");
		        	rd.include(req, res);
		         }
		        else
		        {
		        	HttpSession session = req.getSession();
		        	session.setAttribute("", bean);
		        	
		        }
         }
         catch(Exception e)
         {
        	 e.printStackTrace();
         }
		
		
	}

}
