package org.spider;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  //tell hibernate this class has to mapped to a table
@Table(name="table_heart")   // giving our own name to table
public class Heart implements Serializable
{
	@Id
	@GeneratedValue
	
	@Column(name="heart_id")
	private int id;
	@Column(name="heart_beatPerMin")
	private int beatPerMin;
	@Column(name="heart_disease")
	private boolean hasDisease;
	
	
	public Heart()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getBeatPerMin() {
		return beatPerMin;
	}
	public void setBeatPerMin(int beatPerMin) {
		this.beatPerMin = beatPerMin;
	}
	public boolean isHasDisease() {
		return hasDisease;
	}
	public void setHasDisease(boolean hasDisease) {
		this.hasDisease = hasDisease;
	}


	@Override
	public String toString() {
		return "Heart [id=" + id + ", beatPerMin=" + beatPerMin + ", hasDisease=" + hasDisease + "]";
	}
	
	
	
	
	
}
