package org.spiders;

import org.springframework.stereotype.Component;

@Component("keyboard")
public class Keyboard
{
	private int modelNumber;
	private String name;
	private double price;
	
	
	
	
	
	public Keyboard(int modelNumber, String name, double price) {
		super();
		this.modelNumber = modelNumber;
		this.name = name;
		this.price = price;
	}



	public Keyboard() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getModelNumber() {
		return modelNumber;
	}



	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "Keyboard [modelNumber=" + modelNumber + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
}
