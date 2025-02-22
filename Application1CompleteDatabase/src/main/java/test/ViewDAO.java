package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ViewDAO
{
	public ArrayList<ProdcutBean>  viewProduct()
	{
		ArrayList<ProdcutBean> list= new ArrayList<ProdcutBean>();
		try
		{
			
			Connection con = DBConnection.getCon();
			PreparedStatement ps = con.prepareStatement("select * from product70");
			ResultSet rs= ps.executeQuery();
			while(rs.next())
			{
				ProdcutBean pb=new ProdcutBean();
				pb.setPid(rs.getInt(1));
				pb.setPname(rs.getString(2));
				pb.setPrice(rs.getDouble(3));
				pb.setQty(rs.getInt(4));
				list.add(pb);
				
				
			}
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return list;
	}

}
