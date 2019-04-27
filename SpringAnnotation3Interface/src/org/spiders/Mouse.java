package org.spiders;

import org.springframework.stereotype.Component;

@Component("mouse")
public class Mouse implements ComputerUtil
{
	
	private int Modelnumber;
	private String ModelName;
	private double price;
	
	
	
	public Mouse() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Mouse(int modelnumber, String modelName, double price) {
		super();
		Modelnumber = modelnumber;
		ModelName = modelName;
		this.price = price;
	}



	public int getModelnumber() {
		return Modelnumber;
	}

	public void setModelnumber(int modelnumber) {
		Modelnumber = modelnumber;
	}

	public String getModelName() {
		return ModelName;
	}

	public void setModelName(String modelName) {
		ModelName = modelName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mouse [Modelnumber=" + Modelnumber + ", ModelName=" + ModelName + ", price=" + price + "]";
	}
	
	
	
}
