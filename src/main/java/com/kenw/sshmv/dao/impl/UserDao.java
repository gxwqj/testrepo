package com.kenw.sshmv.dao.impl;

import java.io.Serializable;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.kenw.sshmv.dao.IUserDao;
import com.kenw.sshmv.entity.User;

@Transactional
@Repository("userDao")
public class UserDao implements IUserDao {
    
    /**
     * 使用@Autowired注解将sessionFactory注入到UserDao中
     */
    @Autowired
    private SessionFactory sessionFactory;
    
    @Autowired
    private HibernateTemplate hibernateTemplate;

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(user);

	}
    
    /*
    @Override
    public Serializable save(User user) {
        return sessionFactory.getCurrentSession().save(user);
    }
    */
    

}