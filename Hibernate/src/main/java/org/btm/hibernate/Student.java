package org.btm.hibernate;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
//	@Table(name="student")
public class Student implements Serializable
{
	@Id
private int id;
//	@Column(name="icolor")
private String color;
//	@Transient
private int mobile;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getMobile() {
	return mobile;
}
public void setMobile(int mobile) {
	this.mobile = mobile;
}
}
