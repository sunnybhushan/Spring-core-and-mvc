package org.btm.jdbcApp.service;

import org.btm.jdbcApp.dto.StudentDto;

public interface StudentServiceInterfce 
{

	public int saveStudent(StudentDto dto) throws Exception;
	public StudentDto fetchStudent(String userName ) throws Exception;
	public int deleteStudent (long rollNo) throws Exception;
	
}
