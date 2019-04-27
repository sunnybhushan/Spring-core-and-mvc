package org.btm.HibernateApp;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// @Entity tells hibernate that this 
//call is the class which has to saved in db
@Entity				//1st rule
@Table(name="sunny")
public class Student implements Serializable
{
	//2nd rule
	
	@Id		//to tell this is the primary key in my class.
	@GeneratedValue //it is used for automatic id without giving the id
	private int id;
	@Column(name="Aname")
	private String name;
	private int pirce;
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
	public int getPirce() {
		return pirce;
	}
	public void setPirce(int pirce) {
		this.pirce = pirce;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", pirce=" + pirce + "]";
	}
}
