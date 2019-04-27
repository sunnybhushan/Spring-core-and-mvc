package org.spiders.springsApp;

public class Saurav 
{
	private int id;
	private String son;
	private boolean gender;
	
	public Saurav(int id, String son, boolean gender) {
		super();
		this.id = id;
		this.son = son;
		this.gender = gender;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSon() {
		return son;
	}
	public void setSon(String son) {
		this.son = son;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}


	@Override
	public String toString() {
		return "Saurav [id=" + id + ", son=" + son + ", gender=" + gender + "]";
	}
	
	
	
	
	
	
}
