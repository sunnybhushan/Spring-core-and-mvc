package org.btm.jdbcApp.service;

import org.btm.jdbcApp.dao.StudentDaoImpl;
import org.btm.jdbcApp.dao.StudentDaoInterface;
import org.btm.jdbcApp.dto.StudentDto;

public class StudentServiceImpl implements StudentServiceInterfce {

	StudentDaoInterface studentDao = new StudentDaoImpl();

	@Override
	public int saveStudent(StudentDto student) throws Exception {

		String password = student.getPassword();
		// dummy logic just for test
		String newpassword = password +password;
		student.setPassword(newpassword);
		
		int result = studentDao.saveStudent(student);
		
		return result;
	}

	
	@Override
	public StudentDto fetchStudent(String userName) throws Exception {
		// some logic or no logic 
		 StudentDto  student = studentDao.fetchStudent(userName);
		return student;
	}


	@Override
	public int deleteStudent(long rollNo) throws Exception {
		int result = studentDao.deleteStudent(rollNo);
		return result;
	}

	
}
