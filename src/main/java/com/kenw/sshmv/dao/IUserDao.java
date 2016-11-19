package com.kenw.sshmv.dao;

import java.io.Serializable;

import com.kenw.sshmv.entity.User;

public interface IUserDao {

    /**
     * 保存用户
     * @param user
     * @return
     */
	/*
    Serializable save(User user); 
    */
	
	public void save(User user);
}