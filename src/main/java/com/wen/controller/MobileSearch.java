package com.wen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wen.po.Mobile;
import com.wen.service.MobileService;

@Controller
public class MobileSearch {

	@Autowired
	MobileService service;
	
	@RequestMapping("/search")
	public String search(String number,Model model){
		Mobile mobile=null;
		mobile = service.search(number);
		String msg="";
		if(mobile!=null){
			
			msg="号码:"+number+" 归属地:"+mobile.getArea()+" 所属运营商:"+mobile.getMobiletype();
			
		}else{
			msg="号码:"+number+"在号段库不存在!";
		}
		
		model.addAttribute("msg", msg);
		
		return "result";
	}
}
