package com.tage.spring.aop.aopimpl;

import java.util.Arrays;
import javax.annotation.PostConstruct;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Brief info of the class CountAspect.
 **/
@Aspect
public class CountAspect {

  @Pointcut("execution (public int com.tage.spring.aop.service.Count.*(..))")
  public void pointcut() {
  }

  @Before("pointcut()")
  public void before(JoinPoint joinPoint) {
    System.out.println("--------CountAspect @Before-----------"
    +joinPoint.getSignature().getName()+"---args is "
        + Arrays.asList(joinPoint.getArgs()));
  }

  @After("pointcut()")
  public void after() {
    System.out.println("--------CountAspect @After-----------");
  }

  @AfterReturning(value = "pointcut()", returning = "result")
  public void afterReturning(Object result) {
    System.out.println("--------CountAspect @AfterReturning-----result is: "+result+"------");
  }

  @AfterThrowing(value = "pointcut()",throwing = "excep")
  public void afterThrowing(Exception excep) {
    System.out.println("--------CountAspect @AfterThrowing-----excep is: "+excep.getMessage()+"------");
  }

  @Around("pointcut()")
  public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
    System.out.println("--------CountAspect @Around start-----------");
    Object a = proceedingJoinPoint.proceed();
    System.out.println("--------CountAspect @Around end-----------");
    return a;
  }

}
