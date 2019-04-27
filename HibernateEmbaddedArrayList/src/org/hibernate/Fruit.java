package org.hibernate;

import java.io.Serializable;


import javax.persistence.Embeddable;
@Embeddable
public class Fruit implements Serializable {
	private int noOfSeeds;
	private String color;

	public int getNoOfSeeds() {
		return noOfSeeds;
	}

	public void setNoOfSeeds(int noOfSeeds) {
		this.noOfSeeds = noOfSeeds;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Fruit [noOfSeeds=" + noOfSeeds + ", color=" + color + "]";
	}

}
