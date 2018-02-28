package com.brandonlee.instagram.Database;

/**
 * Created by adria on 2/1/2018.
 */

public class User {

    String email;
    String user_id;
    String username;

    public User(String email, String user_id, String username) {
        this.email = email;
        this.user_id = user_id;
        this.username = username;
    }

    public User(){

    }

    public String getEmail() {
        return email;
    }

    public String getUser_id() {
        return user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", userID='" + user_id + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}