package com.springdemo.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
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
            System.out.println("The Argument is " + o);
        }
    }

    @AfterReturning(value = "execution( Integer get*(..))", returning = "str")
    public void beforeGetter(Integer str) {

        str = str + 2;

        System.out.println("Running after execution " + str);

    }


}