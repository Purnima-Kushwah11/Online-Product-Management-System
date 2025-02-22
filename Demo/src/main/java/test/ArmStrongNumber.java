package test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/Armstrong No")
public class ArmStrongNumber extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		PrintWriter pw = res.getWriter();
		int num = Integer.parseInt(req.getParameter("num"));
		int count=0;
		int temp;
		int sum=0;
		temp=num;
		int digit;
		while(temp!=0)//153
		{
			
			count++;//1/2//3
			temp=temp/10;//15
			
		}
		
		num=temp;
		while(temp>0)
		{
			digit=temp%10;//3
			int power=1;
			
			for(int i=0;i<count;i++)
			{
				power=power*digit;//3*3
			}
			sum=sum+power;
			temp=temp/10;
		}
		if(sum==num)
		{
			pw.println("Armstrong Number");
		}
		else
		{
			pw.println("Not a ArmStrong Number");
		}
		
	}

}
