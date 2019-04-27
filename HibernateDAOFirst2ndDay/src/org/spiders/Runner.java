package org.spiders;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.spiders.dao.FacultyDao;
import org.spiders.dto.FacultyDto;
import org.spiders.dto.StudentDto;

import com.spiders.HibernateUtil;

public class Runner implements Serializable {
	public static void main(String[] args) 
	{
	
		FacultyDto f1= new FacultyDto();
		f1.setName("Kritij Sir");
		f1.setAge(25);
		f1.setDegree("Btech");
		f1.setTeaching("science");
		
		
		FacultyDto f2= new FacultyDto();
		f2.setName("Shishra Sir");
		f2.setAge(40);
		f2.setDegree("BtechEle");
		f2.setTeaching("maths");
		
		
		StudentDto std1= new StudentDto();
		std1.setName("sunny");
		std1.setAge(20);
		std1.setStandered("12");
		
		StudentDto std2= new StudentDto();
		std2.setName("ravi");
		std2.setAge(22);
		std2.setStandered("2");
		
		StudentDto std3= new StudentDto();
		std3.setName("amit");
		std3.setAge(5);
		std3.setStandered("01");
		
		
		List<StudentDto> studentForf1 = new ArrayList<StudentDto>();
		studentForf1.add(std1);
		studentForf1.add(std2);
		
		
		List<StudentDto> studentForf2= new ArrayList<StudentDto>();
		studentForf2.add(std1);
		studentForf2.add(std3);
		
		List<FacultyDto> facultyForstd1 = new ArrayList<FacultyDto>();
		facultyForstd1.add(f1);
		facultyForstd1.add(f2);
		
		List<FacultyDto> facultyForstd2= new ArrayList<FacultyDto>();
		facultyForstd2.add(f1);
		
		List<FacultyDto> facultyForstd3 = new ArrayList<FacultyDto>();
		facultyForstd3.add(f2);
		
		f1.setStudentDto(studentForf1);
		f2.setStudentDto(studentForf2);
		
		
		std1.setListOfFacultyDto(facultyForstd1);
		std2.setListOfFacultyDto(facultyForstd2);
		std3.setListOfFacultyDto(facultyForstd3);
		
		/*
		 * SessionFactory factory= HibernateUtil.getFactory(); Session
		 * session=factory.openSession(); session.beginTransaction();
		 * 
		 * session.save(f1); session.save(f2); session.save(std1); session.save(std2);
		 * session.save(std3);
		 * 
		 * session.getTransaction().commit(); session.close();
		 */
		
		// libernate logic
		
		List<FacultyDto> listOfAllFaculty= new ArrayList<FacultyDto>();
		listOfAllFaculty.add(f1);
		listOfAllFaculty.add(f2);
		
		List<StudentDto> listOfAllStudent= new ArrayList<StudentDto>();
		listOfAllStudent.add(std1);
		listOfAllStudent.add(std2);
		listOfAllStudent.add(std3);
		
		FacultyDao dao= new FacultyDao();
		dao.saveFacultyandStudents(listOfAllFaculty, listOfAllStudent);
		
	}
}












