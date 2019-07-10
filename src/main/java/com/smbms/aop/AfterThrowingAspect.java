package com.smbms.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
@Aspect
public class AfterThrowingAspect {
    private static final Logger log = Logger.getLogger("AfterAspect.class");

    /**
     * 最终增强，肯定会执行
     * @param joinPoint
     */
//    @AfterThrowing(value = "com.smbms.aop.Pointcut.pointcut1()")
    public void after(JoinPoint joinPoint,RuntimeException e){
        log.error(joinPoint.getSignature().getName()+"方法发生异常："+e);
    }
}
