package com.kenw.sshmv.dao.impl;

import org.springframework.stereotype.Repository;

import com.kenw.sshmv.dao.*;

@Repository
public class TestDao implements ITestDao{
	
	@Override
	public String daoHello(){
		String s = "Hello, Test Dao!";
		System.out.println(s);
		return s;
	}

}
