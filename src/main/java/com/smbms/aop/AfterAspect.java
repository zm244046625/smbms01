package com.smbms.aop;

import org.aspectj.lang.JoinPoint;

import java.util.Arrays;
import org.apache.log4j.Logger;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AfterAspect {
    private static final Logger log = Logger.getLogger("AfterAspect.class");

    /**
     * 最终增强，肯定会执行
     * @param joinPoint
     */
    @After(value = "com.smbms.aop.Pointcut.pointcut1()")
    public void after(JoinPoint joinPoint){
        System.out.println("after..........");
        // getTarget得到被代理的目标对象
        // getSignature().getName()拿到被代理的目标方法名
        // getArgs返回传递给目标方法的参数数组
        log.info("调用"+joinPoint.getTarget()+"的"
                +joinPoint.getSignature().getName()+"方法。方法入参："
                + Arrays.toString(joinPoint.getArgs()));
    }
}
