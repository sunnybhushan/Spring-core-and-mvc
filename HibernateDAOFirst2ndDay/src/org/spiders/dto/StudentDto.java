package org.spiders.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "student_books")
public class StudentDto implements Serializable 
{
	@Id
	@GeneratedValue(generator = "abc")
	@GenericGenerator(name = "abc", strategy = "increment")
	private int id;

	@Column(name = "student_name")
	private String name;

	@Column(name = "student_age")
	private int age;
	
	@Column(name = "student_standered")
	private String standered;

	@ManyToMany(mappedBy="studentDto") //listOfFaculty
	List<FacultyDto> listOfFacultyDto;

	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getname() {
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

	public String getStandered() {
		return standered;
	}

	public void setStandered(String standered) {
		this.standered = standered;
	}

	public List<FacultyDto> getListOfFacultyDto() {
		return listOfFacultyDto;
	}

	public void setListOfFacultyDto(List<FacultyDto> listOfFacultyDto) {
		this.listOfFacultyDto = listOfFacultyDto;
	}

	@Override
	public String toString() {
		return "StudentDto [id=" + id + ", location=" + name + ", age=" + age + ", standered=" + standered
				+ ", listOfFacultyDto=" + listOfFacultyDto + "]";
	}

	
}
