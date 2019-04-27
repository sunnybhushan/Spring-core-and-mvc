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
@Table(name = "laptop_table")
public class Laptop implements Serializable {
	@Id
	@GeneratedValue(generator = "abc")
	@GenericGenerator(name = "abc", strategy = "increment")
	@Column(name = "latop_id")
	private int id;

	@Column(name = "laptop_name")
	private String name;

	@Column(name = "laptop_keep")
	private boolean keep;

	@OneToOne(mappedBy = "lenovo")
	private Lenovo lenovo;

	public Laptop() {
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

	public boolean isKeep() {
		return keep;
	}

	public void setKeep(boolean keep) {
		this.keep = keep;
	}

	public Lenovo getLenovo() {
		return lenovo;
	}

	public void setLenovo(Lenovo lenovo) {
		this.lenovo = lenovo;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", keep=" + keep + ", lenovo=" + lenovo + "]";

	}
}
