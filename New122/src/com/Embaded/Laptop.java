package com.Embaded;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Laptop implements Serializable 
{

	private String ram;
	
	private String hardDriveSpace;
	//private int id; not possible
	
	public String getRam() {
		return ram;
	}
	
	public void setRam(String ram) {
		this.ram = ram;
	}
	
	public String getHardDriveSpace() {
		return hardDriveSpace;
	}
	public void setHardDriveSpace(String hardDriveSpace) {
		this.hardDriveSpace = hardDriveSpace;
	}
	
	@Override
	public String toString() 
	{
		return "Laptop [ram=" + ram + ", hardDriveSpace=" + hardDriveSpace + "]";
	}

	
}
