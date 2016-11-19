package com.kenw.sshmv.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.kenw.sshmv.dao.ITestDao;
import com.kenw.sshmv.service.ITestService;

@ParentPackage("basePackage")
@Controller
@Action(value="t")
@Namespace("/")
public class TestAction {
	
	@Autowired
	ITestDao myTestDao;
	
	@Autowired
	ITestService myTestService;	
	
	//http://localhost:8080/sshmv/t!se.action
	public void se(){
		
		myTestService.sayHello();
	}
	
	//http://localhost:8080/sshmv/t!de.action
	public void de(){
		
		myTestDao.daoHello();
	}	

}
