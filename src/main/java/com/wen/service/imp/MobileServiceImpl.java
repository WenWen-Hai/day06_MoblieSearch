package com.wen.service.imp;

import com.wen.dao.MobileDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wen.po.Mobile;
import com.wen.service.MobileService;

@Service("mobileServiceImpl")
public class MobileServiceImpl implements MobileService {

	@Autowired
	MobileDao dao;
	@Override
	public Mobile search(String number) {
		if(number.length()>7){
			
			number=number.substring(0,7);
		}
		return dao.search(number);
	}

}
