package org.spiders.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="faculty_table")
public class FacultyDto implements Serializable
{
	
	@Id
	@GeneratedValue(generator = "abc")
	@GenericGenerator(name = "abc", strategy = "increment")
	@Column(name = "faculty_id")
	private int id;
	@Column(name="faculty_name")
	private String name;
	@Column(name="faculty_age")
	private int age;
	
	@Column(name="faculty_teaching")
	private String teaching;
	
	@Column(name="faculty_degree")
	private String degree;
	
	@ManyToMany
	List<StudentDto> studentDto; //listOfStudent


	public FacultyDto() {
		super();
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


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getTeaching() {
		return teaching;
	}


	public void setTeaching(String teaching) {
		this.teaching = teaching;
	}


	public String getDegree() {
		return degree;
	}


	public void setDegree(String degree) {
		this.degree = degree;
	}


	public List<StudentDto> getStudentDto() {
		return studentDto;
	}


	public void setStudentDto(List<StudentDto> studentDto) {
		this.studentDto = studentDto;
	}


	@Override
	public String toString() {
		return "FacultyDto [id=" + id + ", name=" + name + ", age=" + age + ", teaching=" + teaching + ", degree="
				+ degree + ", studentDto=" + studentDto + "]";
	}
	
	
	
}











