package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UpdateDao 
{
	int k=0;
	public  int update(int pid,String name,double price,int qty)
	{
		try
		{
		Connection con=DBConnection.getCon();
		PreparedStatement ps=con.prepareStatement("update product70 set name=?,price=?,qty=? where code=?");
		ps.setString(1, name);
		ps.setDouble(2, price);
		ps.setInt(3, qty);
		ps.setInt(4, pid);
		k = ps.executeUpdate();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return k;
		
	}

}
