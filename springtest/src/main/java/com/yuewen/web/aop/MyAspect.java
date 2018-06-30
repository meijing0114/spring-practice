package com.yuewen.web.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by liangchen on 2018/6/30.
 */
@Aspect
@Component
public class MyAspect {
    @Before("execution(* com.yuewen.web.controller.HelloController.index(..))")
    public void before() {
        System.out.println("before advice");
    }

    @After("execution(* com.yuewen.web.controller.HelloController.index(..))")
    public void after() {
        System.out.println("after advice");
    }

    @Around("execution(* com.yuewen.web.controller.HelloController.simulateError(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("before around");
        Object result = null;
        try {

            result = joinPoint.proceed();
        }
        catch (Exception e) {

        }
        System.out.println("after around");
        return result;
    }

    @AfterThrowing(value = "execution(* com.yuewen.web.controller.HelloController.simulateError(..))", throwing = "e")
    public void afterThrowing(Throwable e) {
        System.out.println("after throw" + e.getMessage());
    }

    /**
     * 后置通知
     * returnVal,切点方法执行后的返回值
     * 这里可以理解成语法糖
     */
    @AfterReturning(value="execution(* com.yuewen.web.controller.HelloController.simulateError(..))",returning = "returnVal")
    public void AfterReturning(Object returnVal){
        System.out.println("后置通知...."+returnVal);
    }
}
