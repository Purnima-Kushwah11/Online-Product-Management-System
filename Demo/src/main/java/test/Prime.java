package test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/Prime")
public class Prime extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		PrintWriter pw = res.getWriter();
		int num= Integer.parseInt(req.getParameter("num"));
		boolean isPrime=true;
		if(num<=1)
		{
			pw.println("Not Prime Number");
		}
		for(int i=2;i<=Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
			
		}
		if(isPrime)
		{
			pw.println("Prime Number");
		}
		else
		{
			pw.println("Not a Prime Number");
		}
		
	}

	
}
