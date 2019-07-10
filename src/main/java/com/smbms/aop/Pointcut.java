package com.smbms.aop;

import org.springframework.stereotype.Component;

/**
 * 通用切点类
 */
@Component
public class Pointcut {
    @org.aspectj.lang.annotation.Pointcut(value = "execution(* *.save*(..))")
    public void pointcut1(){

    }

    @org.aspectj.lang.annotation.Pointcut(value = "execution(* *.find*(..))")
    public void pointcut2(){

    }

    @org.aspectj.lang.annotation.Pointcut(value = "execution(* *.update*(..))")
    public void pointcut3(){

    }

    @org.aspectj.lang.annotation.Pointcut(value = "execution(* *.delete*(..))")
    public void pointcut4(){

    }
}
