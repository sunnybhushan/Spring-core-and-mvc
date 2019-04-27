package org.spiders.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.spiders.dto.FacultyDto;
import org.spiders.dto.StudentDto;

import com.spiders.HibernateUtil;

public class FacultyDao
{
	
	public int saveFacultyandStudents(List<FacultyDto> listOfFaculty,  List<StudentDto>listOfStudent)
	 {
		 SessionFactory factory= HibernateUtil.getFactory();
			Session session=factory.openSession();
			session.beginTransaction();
			
			for (StudentDto student : listOfStudent) {
				session.save(student);
			}
			
			for (FacultyDto faculty : listOfFaculty) {
				session.save(faculty);
			}
			
			session.getTransaction().commit();
			session.close();
			return 0;
		
	}
}









