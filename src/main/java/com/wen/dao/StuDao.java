package com.wen.dao;

import java.util.List;

import com.wen.po.Stu;

public interface StuDao {

	public List<Stu> getAllStu();
	
	public void save(Stu stu);
}
