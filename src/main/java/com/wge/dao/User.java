package com.wge.dao;

public class User {
    private int uid;
    private int age;
    private String name;
    private String password;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", uid=" + uid +
                ", name='" + name + '\'' +
                ", password=" + password +
                '}';
    }
}
