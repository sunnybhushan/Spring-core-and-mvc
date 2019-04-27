package com.jspiders.hibernate.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "actor_table")
public class ActorDTO implements Serializable {

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "actor_id")
	private int actorId;
	@Column(name = "actor_name")
	private String actorName;
	@Column(name = "language")
	private String language;
	@Column(name = "salary")
	private double salary;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "actor", fetch = FetchType.EAGER)
	private List<FanDTO> fanDTOList;
	
	public ActorDTO() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	public int getActorId() {
		return actorId;
	}

	public void setActorId(int actorId) {
		this.actorId = actorId;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<FanDTO> getFanDTOList() {
		return fanDTOList;
	}

	public void setFanDTOList(List<FanDTO> fanDTOList) {
		this.fanDTOList = fanDTOList;
	}

}
