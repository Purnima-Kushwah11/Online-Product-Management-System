package test;

import java.io.Serializable;

public class AdminBean implements Serializable
{
	private String uname;
	private String password;
	private String fname;
	private String lname;
	private String city;
	private String mId;
	private long phno;
	
	public AdminBean()
	{
		
	}

	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	
	public String getUname()
	{
		return uname;
	}

	public void setUname(String uname) 
	{
		this.uname = uname;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}
	

}
