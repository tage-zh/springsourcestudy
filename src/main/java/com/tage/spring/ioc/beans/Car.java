package com.tage.spring.ioc.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Brief info of the class Car.
 **/
public class Car implements InitializingBean, DisposableBean {

  public Car() {
    System.out.println("Car constructor");
  }

  public void init() {
    System.out.println("Car init");
  }

  public void destroyCar() {
    System.out.println("Car destroy destroyCar");
  }

  public void afterPropertiesSet() throws Exception {
    System.out.println("Car init afterPropertiesSet");
  }

  public void destroy() throws Exception {
    System.out.println("Car destroy destroy");
  }

  @PostConstruct
  public void initByJSR() {
    System.out.println("Car initByJSR");
  }

  @PreDestroy
  public void destroyCarJSR() {
    System.out.println("Car destroy destroyCarJSR");
  }
}
