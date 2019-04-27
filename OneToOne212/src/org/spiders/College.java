package org.spiders;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "table_college")
public class College implements Serializable {
	@Id
	@GeneratedValue(generator = "neelam")
	@GenericGenerator(name = "neelam", strategy = "increment")
	@Column(name = "student_id")
	private int id;

	@Column(name = "college_name")
	private String name;

	@Column(name = "student_college")
	private String Color;

	@OneToOne
	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public College() {
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

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", Color=" + Color + ", student=" + student + "]";
	}

}
