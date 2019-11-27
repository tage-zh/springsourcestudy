package com.tage.spring.aop.config;

import com.tage.spring.aop.aopimpl.CountAspect;
import com.tage.spring.aop.beans.Light;
import com.tage.spring.aop.service.Count;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Brief info of the class AwareConfig.
 **/
@Configuration
@ComponentScan("com.tage.spring.aop")
@EnableAspectJAutoProxy
public class AwareConfig {

  @Bean({"count1","count2"})
  public Count count(){
    return new Count();
  }

  @Bean
  public CountAspect countAspect(){
    return new CountAspect();
  }

}
