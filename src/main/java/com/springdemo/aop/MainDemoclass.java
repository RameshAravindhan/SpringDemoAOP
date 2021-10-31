package com.springdemo.aop;

import com.springdemo.aop.dao.AccountDAO;
import com.springdemo.aop.dao.StudentAccount;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoclass {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO accountDAO = annotationConfigApplicationContext.getBean("accountDAO", AccountDAO.class);

        accountDAO.addAccount();
        accountDAO.setStudentAccount(new StudentAccount("Ramesh", 25));

        System.out.println("Name : " + accountDAO.getStudentAccount().getName() + " ; Age : " + accountDAO.getStudentAccount().getAge());

        System.out.println(accountDAO.UpdateAccount());
        annotationConfigApplicationContext.close();

    }
}