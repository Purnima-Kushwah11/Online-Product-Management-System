package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminLoginDAO
{
	
	
	public AdminBean Login (String un,String pw)
	{
		AdminBean ab=null;
		try
		{
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("select * from Admin70 where uname=? and pword=?");
			ps.setString(1, un);
			ps.setString(2, pw);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				ab=new AdminBean();
				ab.setPassword(rs.getString(1));
				ab.setUname(rs.getString(2));
				ab.setFname(rs.getString(3));
				ab.setLname(rs.getString(4));
				ab.setCity(rs.getString(5));
				ab.setmId(rs.getString(6));
				ab.setPhno((rs.getLong(7)));
				
				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ab;
	}

}
