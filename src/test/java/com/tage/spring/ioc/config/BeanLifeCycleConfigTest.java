package com.tage.spring.ioc.config;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * BeanLifeCycleConfig Tester.
 *
 * @author zhao hu
 * @version 1.0
 * @since <pre>Sep 25, 2019</pre>
 */
public class BeanLifeCycleConfigTest {

  @Test
  public void testBike() throws Exception {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanLifeCycleConfig.class);
    System.out.println("IOC completed");
//    applicationContext.getBean("bike");
    for (String beanDefinitionName : applicationContext.getBeanDefinitionNames()) {
      System.out.println(beanDefinitionName);
    }
    applicationContext.close();

  }


} 
