package com.kenw.sshmv.service.impl;

import com.kenw.sshmv.service.ITestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kenw.sshmv.dao.*;

@Service("myTestService")
public class TestService implements ITestService{

	@Autowired
	ITestDao testDao;

	@Override
	public String sayHello(){
		
		String s = "Hello, Test Service! and " + testDao.daoHello();;
		System.out.println(s);
		return s;
	}
}
