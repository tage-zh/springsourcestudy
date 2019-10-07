package com.tage.spring.aop.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.util.StringValueResolver;

/**
 * Brief info of the class Light.
 **/
@Component
public class Light implements ApplicationContextAware, BeanNameAware, EmbeddedValueResolverAware {

  public void setBeanName(String name) {

    System.out.println("bean name is "+name);
  }

  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    System.out.println("applicationContext is "+applicationContext);

  }

  public void setEmbeddedValueResolver(StringValueResolver resolver) {
    String result = resolver.resolveStringValue("os name is ${os.name}, count #{3*8}");
    System.out.println("resolver string is " + result);

  }
}
