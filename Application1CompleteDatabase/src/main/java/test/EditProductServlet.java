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
@WebServlet("/edit")
public class EditProductServlet extends HttpServlet
{

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		
		HttpSession hs= req.getSession(false);
		if(hs==null)
		{
			req.setAttribute("msg", "Session Expired!<br>");
			RequestDispatcher rd = req.getRequestDispatcher("msg.jsp");
			rd.forward(req, resp);
			
		}
		else
		{
			ArrayList<ProdcutBean> al=(ArrayList<ProdcutBean>)hs.getAttribute("alist");
			int pc = Integer.parseInt(req.getParameter("pId"));
			Iterator<ProdcutBean> it= al.iterator();
			while(it.hasNext())
			{
				ProdcutBean pb =(ProdcutBean) it.next();
				if(pc==pb.getPid())
				{
					req.setAttribute("pbean", pb);
					RequestDispatcher rd = req.getRequestDispatcher("EditProduct.jsp");
					rd.forward(req, resp);
					break;
				}
				
			}
		
		}
	}

}
