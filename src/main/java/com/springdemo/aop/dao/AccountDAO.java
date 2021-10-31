package com.springdemo.aop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    String sampleString;
    Integer i = 2;

    public Integer getI() {
        return i;
    }

    public void setI(Integer i) {
        this.i = i;
    }

    public String getSampleString() {
        return sampleString;
    }

    public void setSampleString(String sampleString) {
        this.sampleString = sampleString;
    }

    public void addAccount() {
        System.out.println(getClass() + "  Executing Account DAO");
    }

}