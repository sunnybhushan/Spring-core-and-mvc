package com.jspider.app.dao;

import com.jspider.app.dto.StudentDto;

public interface StudentDaoInterface {

	public int saveStudent(StudentDto dto) throws Exception;	
	public StudentDto fetchStudent(String userName ) throws Exception;
	public int deleteStudent( long rollNO) throws Exception;
	
}
