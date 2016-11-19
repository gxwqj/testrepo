package com.kenw.sshmv.test;

import java.util.Date;
import java.util.UUID;

import com.kenw.sshmv.entity.User;
import com.kenw.sshmv.service.IUserService;
import com.kenw.sshmv.service.impl.UserService;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    private IUserService userService;
    
    /**
     * 这个before方法在所有的测试方法之前执行，并且只执行一次
     * 所有做Junit单元测试时一些初始化工作可以在这个方法里面进行
     * 比如在before方法里面初始化ApplicationContext和userService
     */
    @Before
    public void before(){
    	ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        userService = (UserService) ac.getBean("userService");
    }
    
    @Test
    public void testSaveMethod(){
        //ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-hibernate.xml"});
        //UserServiceI userService = (UserServiceI) ac.getBean("userService");
        User user = new User();
        user.setName("风中Tom");
        user.setPwd("123");
        user.setCreatedatetime(new Date()); 
        user.setModifydatetime(new Date());
        userService.save(user);
        
        System.out.println("User test OK!");
    }
}