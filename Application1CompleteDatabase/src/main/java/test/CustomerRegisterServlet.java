package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Customer")
public class CustomerRegisterServlet extends HttpServlet
{
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		HttpSession hs= req.getSession();
		
		if(hs==null)
		{
			req.setAttribute("msg", "Session Expired!!<br>");
			RequestDispatcher rd= req.getRequestDispatcher("msg.jsp");
			rd.forward(req, res);
			
		}
		else
		{
			CustomerBean cb= new CustomerBean();
			cb.setUname(req.getParameter("uname"));
			cb.setPassword(req.getParameter("pword"));
			cb.setFname(req.getParameter("fname"));
			cb.setLname(req.getParameter("lname"));
			cb.setMailId(req.getParameter("mid"));
			cb.setCity(req.getParameter("city"));
			cb.setPhno(Long.parseLong(req.getParameter("phno")));
			
			try
			{
				CustomerDAO dao = new CustomerDAO();
				int k = dao.insertCustomer(cb);
				if(k>0)
				{
					 req.setAttribute("msg", "Registration  SuccessFully!!<br>");
					 RequestDispatcher rd = req.getRequestDispatcher("Registersuccess.jsp");
					 rd.forward(req, res);
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

		
		 
		}
		
	}

}
