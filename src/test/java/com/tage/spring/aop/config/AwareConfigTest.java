package com.tage.spring.aop.config;

import static org.junit.Assert.*;

import com.tage.spring.aop.service.Count;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AwareConfigTest {

  @Test
  public void light() {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AwareConfig.class);
    applicationContext.getBean(Count.class).div(1,0);
    applicationContext.close();
  }
}