package com.springdemo.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {


    StudentAccount studentAccount;

    public StudentAccount getStudentAccount() {
        return studentAccount;
    }

    public void setStudentAccount(StudentAccount studentAccount) {
        this.studentAccount = studentAccount;
    }

    public void addAccount() {
        System.out.println(getClass() + "  Executing Account DAO");
    }

    public String UpdateAccount() {
        System.out.println(getClass() + "  Executing Update DAO" + getStudentAccount().getAge() + getStudentAccount().getName());

        int i = 1 / 0;

        return "Updated";
    }


}