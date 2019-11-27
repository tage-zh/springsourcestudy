package com.tage.spring.aop.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Brief info of the class MyBeanPostProcessor.
 **/
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    System.out.println(beanName);
    return null;
  }
}
