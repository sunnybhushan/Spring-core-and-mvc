package com.jspiders.hibernate.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "fan_table")
public class FanDTO implements Serializable {

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "fan_id")
	private int fanId;
	@Column(name = "f_name")
	private String fanName;
	@Column(name = "f_type")
	private String type;
	@Column(name = "f_age")
	private double age;
	
	@ManyToOne(cascade = {
			CascadeType.DETACH,
			CascadeType.MERGE,
			CascadeType.PERSIST,
			CascadeType.REFRESH
	})
	/*@JoinTable(name = "fan_actor_table",
			joinColumns = @JoinColumn(name = "f_id"),
			inverseJoinColumns = @JoinColumn(name = "a_id"))*/
	@JoinColumn(name = "a_id")
	private ActorDTO actor;
	
	public FanDTO() {
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	public int getFanId() {
		return fanId;
	}

	public void setFanId(int fanId) {
		this.fanId = fanId;
	}

	public String getFanName() {
		return fanName;
	}

	public void setFanName(String fanName) {
		this.fanName = fanName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public ActorDTO getActor() {
		return actor;
	}

	public void setActor(ActorDTO actor) {
		this.actor = actor;
	}

}
