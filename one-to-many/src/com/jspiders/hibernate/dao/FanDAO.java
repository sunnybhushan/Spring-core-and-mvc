package com.jspiders.hibernate.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jspiders.hibernate.dto.FanDTO;
import com.spiders.HibernateUtil;

public class FanDAO {

	private SessionFactory factory = HibernateUtil.getFactory();
			//.getSessionFactory();
	
	
	public void saveFanList(List<FanDTO> fanDTOList) {
		Transaction transaction = null;
		try(Session session = factory.openSession();) {
			transaction = session.beginTransaction();
			for (FanDTO fanDTO : fanDTOList) {
				session.persist(fanDTO);
			}
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
		}
	}
}
