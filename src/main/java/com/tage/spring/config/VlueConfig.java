package com.tage.spring.config;

import com.tage.spring.beans.Bird;
import com.tage.spring.controller.PersonController;
import com.tage.spring.service.PersonService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;

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
