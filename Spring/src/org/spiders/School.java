package org.spiders;

import java.util.List;

public class School 
{
	
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String camera;
	private String screen;
	private String battery;
	
	private List<String> component; 
	
	
	private Student student;
	
	               

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getCamera() {
		return camera;
	}

	public void setCamera(String camera) {
		this.camera = camera;
	}

	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	public List<String> getComponent() {
		return component;
	}

	public void setComponent(List<String> component) {
		this.component = component;
	}

	


	public School(String camera, String screen, String battery, List<String> component, Student student) {
		super();
		this.camera = camera;
		this.screen = screen;
		this.battery = battery;
		this.component = component;
		this.student = student;
	}

	@Override
	public String toString() {
		return "School [camera=" + camera + ", screen=" + screen + ", battery=" + battery + ", component=" + component
				+ ", student=" + student + "]";
	}

	
	
	

	


	
}
