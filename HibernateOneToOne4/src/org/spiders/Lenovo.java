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
@Table(name="lenovo_table")
public class Lenovo implements Serializable
{
	@Id
	@GeneratedValue(generator="sun")
	@GenericGenerator(name="sun",strategy="increment")
	@Column(name="lenovo_id")
	private int id;
	
	@Column(name="lenovo_name")
	private String name;
	
	@Column(name="lenovo_model")
	private String model;
	
	
	private Laptop laptop;

	public Lenovo() {
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

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Lenovo [id=" + id + ", name=" + name + ", model=" + model + ", laptop=" + laptop + "]";
	}
	

}




