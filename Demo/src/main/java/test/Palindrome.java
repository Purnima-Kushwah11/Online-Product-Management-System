package test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/Palindrome No")
public class Palindrome extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		PrintWriter pw = res.getWriter();
		int num = Integer.parseInt(req.getParameter("num"));
		int temp=num;
		int rev=0;
		while(num!=0)
		{
			int r=num%10;
			 rev=(rev*10)+r;
			 num=num/10;
		}
		if(temp==rev)
		{
			pw.println("Palindrome Number");
		}
		else
		{
			pw.println("Not a Palindrome Number");
		}
		
	
		
	}

}
