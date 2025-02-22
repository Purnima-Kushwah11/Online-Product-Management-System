package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteDAO 
{
	int k=0;
	public  int delete(int pid,String name,double price,int qty)
	{
		try
		{
		Connection con=DBConnection.getCon();
		PreparedStatement ps=con.prepareStatement("delete from product70 where code=?");
		ps.setInt(1, pid);
		k = ps.executeUpdate();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return k;
	}	

}
