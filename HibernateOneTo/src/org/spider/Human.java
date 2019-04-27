package org.spider;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="table_human")

public class Human implements Serializable
{
	@Id
	@GeneratedValue
	@Column(name="human_id")
	private int id;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="human_age")
	private int age;
	
	@Column(name="human_lName")
	private String lName;
	
	@OneToOne //foreign key
	private Heart heart;
	
	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Heart getHeart() {
		return heart;
	}


	public void setHeart(Heart heart) {
		this.heart = heart;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	@Override
	public String toString() {
		return "Human [id=" + id + ", firstName=" + firstName + ", age=" + age + ", lName=" + lName + "]";
	}
	
	
}
