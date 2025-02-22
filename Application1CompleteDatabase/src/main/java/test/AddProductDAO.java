package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddProductDAO
{
	int k=0;
	
	public int insertProdcut(ProdcutBean pb) throws SQLException 
	{
		
		Connection con=DBConnection.getCon();
		PreparedStatement ps=con.prepareStatement("insert into PRODUCT70 values(?,?,?,?)");
		ps.setInt(1, pb.getPid());
		ps.setString(2, pb.getPname());
		ps.setDouble(3, pb.getPrice());
		ps.setInt(4, pb.getQty());
		k = ps.executeUpdate();
		
		
		return k;
		
	}
	
	
}
