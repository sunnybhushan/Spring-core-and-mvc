package com.jspiders.hibernate.tester;

import java.util.ArrayList;
import java.util.List;

import com.jspiders.hibernate.dao.ActorDAO;
import com.jspiders.hibernate.dao.FanDAO;
import com.jspiders.hibernate.dto.ActorDTO;
import com.jspiders.hibernate.dto.FanDTO;

public class MainClass {

	public static void main(String[] args) {
		FanDAO fanDAO = new FanDAO();
		
		ActorDTO actorDTO = new ActorDTO();
		actorDTO.setActorName("Ambreesh");
		actorDTO.setLanguage("Kannada");
		actorDTO.setSalary(1000000.5);

		List<FanDTO> listOfFans = new ArrayList<>();
		
		FanDTO fanDTO = new FanDTO();
		fanDTO.setFanName("Mahendra Bahubali");
		fanDTO.setAge(99.8);
		fanDTO.setType("Old");
		fanDTO.setActor(actorDTO);
		
		FanDTO fanDTO1 = new FanDTO();
		fanDTO1.setFanName("Kattappa");
		fanDTO1.setAge(120);
		fanDTO1.setType("Not disclosed");
		fanDTO1.setActor(actorDTO);
		
		FanDTO fanDTO2 = new FanDTO();
		fanDTO2.setFanName("Huccha Venkat");
		fanDTO2.setAge(36.5);
		fanDTO2.setType("Huccha");
		fanDTO2.setActor(actorDTO);
		
		FanDTO fanDTO3 = new FanDTO();
		fanDTO3.setFanName("Akshay Kumar");
		fanDTO3.setAge(23.5);
		fanDTO3.setType("Unknown");
		fanDTO3.setActor(actorDTO);
		
		listOfFans.add(fanDTO);
		listOfFans.add(fanDTO1);
		listOfFans.add(fanDTO2);
		listOfFans.add(fanDTO3);
		
		fanDAO.saveFanList(listOfFans);
		
		/*
		 * ActorDAO actorDAO = new ActorDAO(); ActorDTO actorDTO =
		 * actorDAO.findByActorId(1); if (actorDTO != null) {
		 * System.out.println("Actor Name: " + actorDTO.getActorName());
		 * System.out.println("Language: " + actorDTO.getLanguage());
		 * 
		 * List<FanDTO> fanDTOList = actorDTO.getFanDTOList();
		 * 
		 * if (fanDTOList.size() > 0) { for (FanDTO fanDTO : fanDTOList) {
		 * System.out.println("Fan Name: " + fanDTO.getFanName()); } } }
		 */
	}

}
