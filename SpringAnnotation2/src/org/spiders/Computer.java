package org.spiders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("com")
public class Computer
{
	private String brand;
	private String model;
	
	@Autowired
	private Mouse mouse;
	
	@Autowired
	private Keyboard keyboard;
	
	
	public Mouse getMouse() {
		return mouse;
	}
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	public Keyboard getKeyboard() {
		return keyboard;
	}
	public void setKeyboard(Keyboard keyboard) {
		this.keyboard = keyboard;
	}

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public Computer(String brand, String model, Mouse mouse, Keyboard keyboard) {
		super();
		this.brand = brand;
		this.model = model;
		this.mouse = mouse;
		this.keyboard = keyboard;
	}
	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", model=" + model + ", mouse=" + mouse + ", keyboard=" + keyboard + "]";
	}
	
	
	
}
