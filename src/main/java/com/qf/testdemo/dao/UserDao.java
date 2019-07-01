package com.qf.testdemo.dao;

import com.qf.testdemo.entity.User;
import org.springframework.stereotype.Repository;
/**
 * 〈〉
 *
 * @author hxw
 * @create 2019/6/30
 * @since 1.0.0
 */

@Repository
public interface UserDao{

    public void inserUser(String username,String password);

    public User selectUser(String username, String password);

}
