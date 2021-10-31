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
        try {
            System.out.println("Name : " + accountDAO.getStudentAccount().getName() + " ; Age : " + accountDAO.getStudentAccount().getAge());
        } catch (Exception e) {
            System.out.println("Catched the Exception");
        }


        annotationConfigApplicationContext.close();

    }
}