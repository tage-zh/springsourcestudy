package com.tage.spring.config;

import com.tage.spring.beans.Bird;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * VlueConfig Tester.
 *
 * @author zhao hu
 * @version 1.0
 * @since <pre>Sep 26, 2019</pre>
 */
public class VlueConfigTest {
  /**
   * Method: bird()
   */
  @Test
  public void testBird() throws Exception {
    AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(VlueConfig.class);
    for (String beanDefinitionName : app.getBeanDefinitionNames()) {
      System.out.println(beanDefinitionName);
    }
    Bird bird = (Bird) app.getBean("bird");
    System.out.println(bird);
  }


} 
