package com.qf.testdemo.service;

import com.qf.testdemo.dao.UserDao;
import com.qf.testdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 〈〉
 *
 * @author hxw
 * @create 2019/6/30
 * @since 1.0.0
 */
@Service
public class UserServiceImpl{

    @Autowired
    private UserDao userDao;


    public boolean inserUser(String username, String password) {
        userDao.inserUser(username,password);
        return true;
    }

    public User selectUser(String username, String password) {

        System.out.println(username+" "+username);
        return userDao.selectUser(username,password);

    }
}
