package org.spiders;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("sc")
@Scope("prototype")
public class School 
{
	
	public School() {
		super();
		System.out.println("class is created");
		// TODO Auto-generated constructor stub
	}

	private String camera;
	private String screen;
	private String battery;
	

	
	
	  @PostConstruct
	  public void intMeh() {
	  System.out.println("init method is calledE"); }
	 
	
	@PreDestroy
	public void destroyMethod()
	{
		System.out.println("destroy method is called");
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

	public School(String camera, String screen, String battery, List<String> component, Student student) {
		super();
		this.camera = camera;
		this.screen = screen;
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "School [camera=" + camera + ", screen=" + screen + ", battery=" + battery + ", component=" +  ", student=" +   "]";
	}

	
	
	

	


	
}
