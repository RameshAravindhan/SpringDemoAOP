package com.springdemo.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class MyLoggingAspect {

/*

    execution(modifiers-pattern? return-type-pattern declaring-type-pattern?
            method-name-pattern(param-pattern) throws-pattern?)


    Refer to Slides for different pointCut Expressions

*/


    @Pointcut("execution(* com.springdemo.aop.dao.*.*(..))")
    public void pcMethod() {

    }


    @Pointcut("execution(* com.springdemo.aop.dao.*.get*(..))")
    public void pcMethodwithoutGet() {

    }

    @Pointcut("execution(* com.springdemo.aop.dao.*.set*(..))")
    public void pcMethodwithoutSet() {

    }

    @Pointcut("pcMethod() && !(pcMethodwithoutGet() || pcMethodwithoutSet() )")
    public void combinesPCexpression() {

    }

    @Before("combinesPCexpression()")
    public void usingPCAnnot() {
        System.out.println(getClass() + "  Executing Aspect using pointCut Annotation inn order 1");
    }


}