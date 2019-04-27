package org.hibernateApp;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Name implements Serializable 
{
	@Id
	private int roll;
	private String name;
	private int mobile;
	
public int getRoll()
{
	return roll;
}
public void setRoll(int roll)
{
	 this.roll=roll;
}
public String getName()
{
	return name;
}
public void setName(String name)
{
	this.name=name;
}
public int getMobile()
{
return mobile;	
}
public void setMobile(int mobile)
{
this.mobile=mobile;	
}


@Override
public String toString() {
	return "Student [roll=" + roll + ", name=" + name + ", password=" + mobile + "]";
}
	




}
