package org.hibernate;

import java.util.List;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tree implements Serializable {
	@Id
	@GeneratedValue
	private int id;
	@Column(name = "tree_name", nullable = false, unique = true)
	private String treeName;

	private int age;

	// @Embedded is same as element collection
	@ElementCollection
	private List<Fruit> fruits;

	public List<Fruit> getFruits() {
		return fruits;
	}

	public void setFruits(List<Fruit> fruits) {
		this.fruits = fruits;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTreeName() {
		return treeName;
	}

	public void setTreeName(String treeName) {
		this.treeName = treeName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Tree() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Tree [id=" + id + ", treeName=" + treeName + ", age=" + age + "]";
	}

}
