package org.spiders.springsApp;

public class SchoolDTO 
{
	private int id;
	private String name;
	private String place;
	
	private Saurav sv;
	
	public Saurav getSv() {
		return sv;
	}

	public void setSv(Saurav sv) {
		this.sv = sv;
	}

	public SchoolDTO()
	{
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return "SchoolDTO [id=" + id + ", name=" + name + ", place=" + place + ", sv=" + sv + "]";
	}
	


void initAbc()
{
	System.out.println("init method called");
}

void destroyAbc()
{
	System.out.println("destroyed method called");
}

}







