package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CustomerDAO
{
	int k=0;
	public int insertCustomer(CustomerBean cb)
	{
		
		try
		{
		Connection con=DBConnection.getCon();
		PreparedStatement ps=con.prepareStatement("insert into admin70 values(?,?,?,?,?,?,?)");
		ps.setString(1, cb.getUname());
		ps.setString(2, cb.getPassword());
		ps.setString(3, cb.getFname());
		ps.setString(4, cb.getLname());
		ps.setString(5, cb.getCity());
		ps.setString(6, cb.getMailId());
		ps.setLong(7, cb.getPhno());
		
		k = ps.executeUpdate();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return k;
		
	}

}
