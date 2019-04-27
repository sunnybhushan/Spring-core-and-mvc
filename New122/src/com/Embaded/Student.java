package com.Embaded;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_laptop_table")
public class Student implements Serializable {
	@Id
	@GeneratedValue
	private int id;
	@Column(name = "student_name")
	private String stdStream;
	private int MobilNo;
	@Embedded
	private Laptop laptop;
	
	public Laptop getLaptop()
	{
		return laptop;
	}

	public void setLaptop(Laptop laptop) 
	{
		this.laptop = laptop;
	}

	public int getId() 
	{
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStdStream() {
		return stdStream;
	}

	public void setStdStream(String stdStream) {
		this.stdStream = stdStream;
	}

	public int getMobilNo() {
		return MobilNo;
	}

	public void setMobilNo(int mobilNo) {
		MobilNo = mobilNo;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", stdStream=" + stdStream + ", MobilNo=" + MobilNo + "]";
	}

}
