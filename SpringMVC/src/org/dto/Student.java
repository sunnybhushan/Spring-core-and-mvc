package org.dto;

public class Student 
{
	private int rollNo;
	private String name;
	private String lname;
	private String moblieNo;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMoblieNo() {
		return moblieNo;
	}
	public void setMoblieNo(String moblieNo) {
		this.moblieNo = moblieNo;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", lname=" + lname + ", moblieNo=" + moblieNo + "]";
	}
	
	
	
	
	
}
