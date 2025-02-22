package test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/update")
public class UpdateProductServlet extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		HttpSession hs = req.getSession();
		if(hs==null)
		{
			req.setAttribute("msg", "Session Expired!<br>");
			RequestDispatcher rd = req.getRequestDispatcher("msg.jsp");
			rd.forward(req, resp);
		}
		else
		{
			
			String name = req.getParameter("name");
			double price = Double.parseDouble(req.getParameter("price"));
			int qty=Integer.parseInt(req.getParameter("qty"));
			int pid=Integer.parseInt(req.getParameter("id"));
			int k = new UpdateDao().update(pid,name,price,qty);
			if(k>0)
			{
				req.setAttribute("msg", "Updated SuccessFully!!<br>");
				RequestDispatcher rd = req.getRequestDispatcher("UpdateSucess.jsp");
				rd.forward(req, resp);
			}
			else
			{
				req.setAttribute("msg", "Not Updatetable");
				RequestDispatcher rd = req.getRequestDispatcher("msg.jsp");
				rd.forward(req, resp);
			}
			
		
			
		}
	}
	

}
