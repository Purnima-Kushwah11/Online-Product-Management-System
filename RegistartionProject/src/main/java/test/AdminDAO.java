package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminDAO 
{
	
	public AdminBean Login(String uname,String pass)
	{
		AdminBean ab=null;
		try
		{
		Connection con = DBConnection.getCon();
		PreparedStatement ps = con.prepareStatement("select * from admin70 where uname=? and pass=?");
		ps.setString(1, uname);
		ps.setString(2, pass);
		ResultSet rs = ps.executeQuery();
		if(rs.next())
		{
			 ab = new AdminBean();
			 ab.setUname(rs.getString(1));
			 ab.setPassword(rs.getString(2));
			 ab.setFname(rs.getString(3));
			 ab.setLname(rs.getString(4));
			 ab.setCity(rs.getString(5));
			 ab.setMailId(rs.getString(6));
			 ab.setPhno(rs.getLong(7));
			
		}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ab;
	}

}
