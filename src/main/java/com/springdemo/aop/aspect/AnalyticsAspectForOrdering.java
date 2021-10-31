package com.springdemo.aop.aspect;

import com.springdemo.aop.dao.StudentAccount;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component

public class AnalyticsAspectForOrdering {

/*

    execution(modifiers-pattern? return-type-pattern declaring-type-pattern?
            method-name-pattern(param-pattern) throws-pattern?)


    Refer to Slides for different pointCut Expressions

*/


    @Before("execution( void set*(..))")
    public void beforeSetter(JoinPoint joinPoint) {
        System.out.println(getClass() + "  Executing Analytics Aspect in order 2 for setter");

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println(methodSignature);


        Object[] objects = joinPoint.getArgs();

        for (Object o : objects) {
            System.out.println("The Argument is " + o.toString());
        }
    }

    @AfterThrowing(value = "execution( * get*(..))", throwing = "str")
    public void beforeGetter(Throwable str) {

        System.out.println("inside After throwing Method  " + str);

    }


}