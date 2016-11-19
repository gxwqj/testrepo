package com.kenw.sshmv.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kenw.sshmv.dao.IUserDao;
import com.kenw.sshmv.entity.User;
import com.kenw.sshmv.service.IUserService;

//使用Spring提供的@Service注解将UserService标注为一个Service
@Service("userService")
public class UserService implements IUserService {

    /**
     * 注入userDao
     */
    @Autowired
    private IUserDao userDao;
    
    @Override
    public void test() {
        System.out.println("Hello World!");
    }

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		userDao.save(user);
	}

    /*
    @Override
    public Serializable save(User user) {
        return userDao.save(user);
    }
    */
    
    
    
}