package com.qf.testdemo.service;

import com.qf.testdemo.entity.User;

/**
 * 〈〉
 *
 * @author hxw
 * @create 2019/6/30
 * @since 1.0.0
 */
public interface UserService {

    public boolean inserUser(String username,String password);

    public User selectUser(String username, String password);

}
