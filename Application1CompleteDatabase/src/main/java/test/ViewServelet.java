package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/view")
public class ViewServelet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		HttpSession hs = req.getSession(false);
		if(hs==null)
		{
			req.setAttribute("msg", "No Product Avalible!!!");
			RequestDispatcher rd = req.getRequestDispatcher("viewfailed.jsp");
			rd.forward(req, res);
		}
		else
		{
			ViewDAO viewDAO = new ViewDAO();
			ArrayList<ProdcutBean> al= viewDAO.viewProduct();
			hs.setAttribute("alist", al);
			RequestDispatcher rd = req.getRequestDispatcher("View.jsp");
			rd.forward(req, res);
			
		}
		
		
	}

}
