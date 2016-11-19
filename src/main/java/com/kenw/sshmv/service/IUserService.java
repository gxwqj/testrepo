package com.kenw.sshmv.service;

import java.io.Serializable;
import com.kenw.sshmv.entity.User;

/**
 * 测试
 * @author gacl
 *
 */
public interface IUserService {

    /**
     * 测试方法
     */
    void test();
    
    /**
     * 保存用户
     * @param user
     * @return
     */
    //Serializable save(User user); 
    public void save(User user);
}