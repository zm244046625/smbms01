package com.smbms.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AroundLogger {

    private static final Logger log = Logger.getLogger(AroundLogger.class);

//    @Around(value = "execution(* *.save*(..))")
    public Object aroundLogger(ProceedingJoinPoint joinPoint) throws Throwable{
        log.info("前置增强");
        try {
            //让目标方法执行
            Object result = joinPoint.proceed();
            return result;
        } catch (Exception e){
            log.error(e.getMessage());
            e.printStackTrace();
        } finally {
            log.info("最终增强");
        }
        return null;
    }
}
