package org.spiders;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "table_college")
public class College implements Serializable {
	@Id
	@GeneratedValue(generator = "neelam")
	@GenericGenerator(name = "neelam", strategy = "increment")
	@Column(name = "college_id")
	private int id;

	@Column(name = "college_name")
	private String name;

	@Column(name = "college_cement")
	private String Color;

	/*
	 * @OneToOne private Student student;
	 */
	
	@OneToMany(cascade=CascadeType.ALL)
	List<Student> studentList;

	/*
	 * public Student getStudent() { return student; }
	 * 
	 * public void setStudent(Student student) { this.student = student; }
	 */

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
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

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", Color=" + Color + ", studentList=" + studentList + "]";
	}

	/*
	 * @Override public String toString() { return "College [id=" + id + ", name=" +
	 * name + ", Color=" + Color + ", student=" + student + "]"; }
	 */

}
