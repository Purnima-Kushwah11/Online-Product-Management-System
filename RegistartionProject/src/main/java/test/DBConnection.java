package test;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection
{ 
	private static Connection con=null;
	public DBConnection()
	{
		
	}
	static
	{
		try
		{
			Class.forName(DBInfo.driver);
			con = DriverManager.getConnection(DBInfo.dbURL,DBInfo.dbUname,DBInfo.dbPword);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static Connection getCon()
	{
		return con;
	}
	

	
}
