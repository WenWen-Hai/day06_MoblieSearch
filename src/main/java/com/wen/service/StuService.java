package com.wen.service;

import java.util.List;

import com.wen.po.Stu;

public interface StuService {

	public List<Stu> getAllStu();
	
	public void save(Stu stu);
}
