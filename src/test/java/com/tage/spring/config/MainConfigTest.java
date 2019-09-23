package com.tage.spring.config;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * MainConfig Tester.
 *
 * @author zhao hu
 * @version 1.0
 * @since <pre>Sep 23, 2019</pre>
 */
public class MainConfigTest {

  /**
   * Method: person()
   */
  @Test
  public void testPerson() throws Exception {
    ApplicationContext app = new AnnotationConfigApplicationContext(MainConfig.class);
    System.out.println("init context complete");
    for (String beanDefinitionName : app.getBeanDefinitionNames()) {
      System.out.println(beanDefinitionName);
    }
//    app.getBean("com.tage.spring.beans.Bird");
//    app.getBean("person");
  }


} 
