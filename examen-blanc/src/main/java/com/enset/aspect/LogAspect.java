package com.enset.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.logging.Logger;

@Aspect
public class LogAspect {

    private Logger logger = Logger.getLogger(LogAspect.class.getName());

    @Pointcut("execution(* *..*.*(..))")
    public void logAspect() {};

    @Before("logAspect()")
    public void LogBeforeEveryFunction(JoinPoint jp) {
        logger.info("execution of " + jp.getSignature());
    }
}
