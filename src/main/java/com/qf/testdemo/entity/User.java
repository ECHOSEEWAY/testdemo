package com.qf.testdemo.entity;

import java.io.Serializable;

/**
 * 〈...〉
 *
 * @author hxw
 * @create 2019/6/30
 * @since 1.0.0
 */
public class User implements Serializable {
    private String username;
    private String password;
    private String nickname;
    private String emial;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmial() {
        return emial;
    }

    public void setEmial(String emial) {
        this.emial = emial;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", emial='" + emial + '\'' +
                '}';
    }
}