package com.example;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Aspect
public class LoggingAspect {
    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Before(" execution(* com.example.Order.processOrder(..))")
    public void logBefore() {
        logger.info("Before processing order");
    }

    @After(" execution(* com.example.Order.processOrder(..))")
    public void logAfter(){
        logger.info("After processing order");
    }
}
