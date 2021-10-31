package com.springdemo.aop;

import com.springdemo.aop.dao.AccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoclass {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(DemoConfig.class);

        AccountDAO accountDAO = annotationConfigApplicationContext.getBean("accountDAO", AccountDAO.class);

        accountDAO.addAccount();
        accountDAO.setI(10);
        System.out.println(accountDAO.getI());
        annotationConfigApplicationContext.close();

    }
}