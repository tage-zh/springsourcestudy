package com.tage.spring.ioc.config;

import com.tage.spring.ioc.beans.Bird;
import com.tage.spring.ioc.service.PersonService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Brief info of the class VlueConfig.
 **/
@Configuration
@PropertySource("classpath:/tage.properties")
public class VlueConfig {

  @Bean
  public Bird bird(){
    Bird bird = new Bird();
    return bird;
  }
  @Bean
  public PersonService personService(){
    return new PersonService(2);
  }
}
