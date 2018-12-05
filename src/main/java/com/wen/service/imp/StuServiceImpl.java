package com.wen.service.imp;

import java.util.List;

import com.wen.dao.StuDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wen.po.Stu;
import com.wen.service.StuService;
@Service
public class StuServiceImpl implements StuService {

	@Autowired
	StuDao dao;
	@Override
	public List<Stu> getAllStu() {
		return dao.getAllStu();
	}
	@Override
	public void save(Stu stu) {
		dao.save(stu);
		
	}

}
