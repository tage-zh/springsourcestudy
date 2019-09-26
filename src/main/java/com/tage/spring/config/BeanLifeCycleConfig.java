package com.tage.spring.config;

import com.tage.spring.beans.Bike;
import com.tage.spring.beans.Car;
import com.tage.spring.processor.TageBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Brief info of the class BeanLifeCycleConfig.
 **/
@Configuration
//@ComponentScan("com.tage.spring")
public class BeanLifeCycleConfig {

  @Bean(initMethod = "init", destroyMethod = "destroy")
  public Bike bike() {
    return new Bike();
  }

  @Bean
  public TageBeanPostProcessor tageBeanPostProcessor() {
    return new TageBeanPostProcessor();
  }

  @Bean(initMethod = "init", destroyMethod = "destroyCar")
  public Car car() {
    return new Car();
  }
}
