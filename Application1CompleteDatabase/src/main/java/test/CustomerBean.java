package test;

import java.io.Serializable;

public class CustomerBean implements Serializable
{
	private String uname;
	private String password;
	private String fname;
	private String lname;
	private String city;
	private String mailId;
	private long phno;
	 
	public CustomerBean()
	{
		
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	@Override
	public String toString() {
		return "CustomerBean [uname=" + uname + ", password=" + password + ", fname=" + fname + ", lname=" + lname
				+ ", city=" + city + ", mailId=" + mailId + ", phno=" + phno + "]";
	}
	
	

}
