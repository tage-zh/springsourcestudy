package com.tage.spring.processor;

import com.tage.spring.beans.Car;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Brief info of the class TageBeanPostProcessor.
 **/
@Component
public class TageBeanPostProcessor implements BeanPostProcessor {

  public Object postProcessBeforeInitialization(Object bean, String beanName)
      throws BeansException {
    if(bean instanceof Car)
    System.out.println("postProcessBeforeInitialization" + "----" + beanName + "----" + bean);
    return bean;
  }

  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    if(bean instanceof Car)
    System.out.println("postProcessAfterInitialization" + "----" + beanName + "----" + bean);
    return bean;
  }
}
