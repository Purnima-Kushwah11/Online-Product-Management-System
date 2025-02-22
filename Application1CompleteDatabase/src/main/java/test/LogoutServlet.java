package test;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Logout")
public class LogoutServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		HttpSession session = req.getSession(false);
		if(session==null)
		{
			req.setAttribute("msg", "Session Expired!!<br>");
			RequestDispatcher rd = req.getRequestDispatcher("msg.jsp");
			rd.forward(req, res);
		}
		else
		{
			session.removeAttribute("bean");
			session.removeAttribute("alist");
			req.setAttribute("msg", "Admin LoggedOut SuccessFully!!<br>");
			RequestDispatcher rd = req.getRequestDispatcher("AdminLogout.jsp");
			rd.forward(req, res);
		}
		
		
		
	}


}
