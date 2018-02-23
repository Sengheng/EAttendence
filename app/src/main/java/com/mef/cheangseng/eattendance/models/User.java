package com.mef.cheangseng.eattendance.models;

public class User {

    private String id;
    private String name;
    private String email;
    private String userName;
    private int isTeacher;
    public User() {
    }

    public int getIsTeacher() {
        return isTeacher;
    }

    public void setIsTeacher(int isTeacher) {
        this.isTeacher = isTeacher;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName(){ return userName;}

    public void setUserName(String userName) { this.userName = userName; }
}
