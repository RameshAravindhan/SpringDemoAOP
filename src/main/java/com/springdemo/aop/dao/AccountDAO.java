package com.springdemo.aop.dao;

import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {


    StudentAccount studentAccount;

    public StudentAccount getStudentAccount() {

        int i = 1 / 0;

        return studentAccount;
    }

    public void setStudentAccount(StudentAccount studentAccount) {
        this.studentAccount = studentAccount;
    }

    public void addAccount() {
        System.out.println(getClass() + "  Executing Account DAO");
    }

}