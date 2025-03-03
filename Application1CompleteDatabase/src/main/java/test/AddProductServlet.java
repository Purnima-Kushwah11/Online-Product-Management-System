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

@WebServlet("/AddProduct")
public class AddProductServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{

		
		HttpSession hs = req.getSession(false);
		if(hs==null)
		{
			req.setAttribute("msg", "Session Expired!!<br>");
			RequestDispatcher rd= req.getRequestDispatcher("msg.jsp");
			rd.forward(req, res);
			
		}
		else
		{
			ProdcutBean pb= new ProdcutBean();
			pb.setPid(Integer.parseInt(req.getParameter("pcode")));
			pb.setPname(req.getParameter("pname"));
			pb.setPrice(Double.parseDouble(req.getParameter("pprice")));
			pb.setQty(Integer.parseInt(req.getParameter("pqty")));
			 try
			 {
				 AddProductDAO add = new AddProductDAO();
				 int k = add.insertProdcut(pb);
				 if(k>0)
				 {
					 req.setAttribute("msg", "Product Addedd SuccessFully!!<br>");
					 RequestDispatcher rd = req.getRequestDispatcher("productsuccess.jsp");
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
