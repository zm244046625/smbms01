package com.smbms.aop;

import org.aspectj.lang.JoinPoint;

import java.util.Arrays;
import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggerAspect {
    private static final Logger log = Logger.getLogger("LoggerAspect.class");

    public void before(JoinPoint joinPoint){
        // getTarget通过连接点调取传进来的目标对象
        // getSignature().getName()拿到方法名
        // getArgs拿到目标对象的参数
        System.out.println("before.............");
        log.info("调用"+joinPoint.getTarget()+"的"
                +joinPoint.getSignature().getName()+"方法。方法入参："
                + Arrays.toString(joinPoint.getArgs()));
    }

    /**
     * 后置增强
     * @param joinPoint
     * @param result
     */
    @AfterReturning(value = "com.smbms.aop.Pointcut.pointcut1()",returning = "result")
    public void afterReturning(JoinPoint joinPoint,Object result){
        log.info("调用"+joinPoint.getTarget()+"的"
                +joinPoint.getSignature().getName()+"方法。方法返回值："+result);
    }
}
