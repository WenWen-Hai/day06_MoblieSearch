package com.wen.dao;

import java.util.List;

import com.wen.po.Mobile;

public interface MobileDao {

	public void saves(List<Mobile> list);
	
	public Mobile search(String number);
}
