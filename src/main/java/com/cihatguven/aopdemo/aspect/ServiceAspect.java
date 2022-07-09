package com.cihatguven.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {

    @Before("execution(* com.cihatguven.aopdemo.message_service.MessageService.giveMessage(..))")
    public void beforeGiveMessage(JoinPoint joinPoint){

        System.out.println("Method captured before running. Method is "+joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());

    }

    @After("execution(* com.cihatguven.aopdemo.message_service.*.*(..))")
    public void afterGiveMessage(JoinPoint joinPoint){

        System.out.println("Method captured after running. Method is "+joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());

    }

}
