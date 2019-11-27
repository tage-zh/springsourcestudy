package com.tage.spring.aop.aopimpl;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Brief info of the class ApplicationListenerAspect.
 **/
@Aspect
public class ApplicationListenerAspect {
  @Pointcut("execution(* *.onApplicationEvent(..))")
  public void listener(){}

  @Before("listener()")
  private void beforeListener(){
    System.out.println("before listener");
  }

}
