package com.jspiders.hibernate.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.jspiders.hibernate.dto.ActorDTO;
import com.spiders.HibernateUtil;

public class ActorDAO {
	
	private SessionFactory factory = HibernateUtil.getFactory();
			//getSessionFactory();

	public ActorDTO findByActorId(int primaryKey) {
		ActorDTO actorDTO = null;
		try(Session session = factory.openSession();) {
			actorDTO = session.get(ActorDTO.class, new Integer(primaryKey));
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return actorDTO;
	}
}
