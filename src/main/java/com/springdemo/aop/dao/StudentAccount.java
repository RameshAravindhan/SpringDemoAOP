package com.springdemo.aop.dao;

public class StudentAccount {

    String name;
    int age;

    public StudentAccount(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public StudentAccount() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentAccount{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}