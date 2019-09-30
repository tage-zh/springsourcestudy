package com.tage.spring.ioc.config;

import com.tage.spring.ioc.controller.PersonController;
import com.tage.spring.ioc.dao.PersonDao;
import com.tage.spring.ioc.service.PersonService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

/**
 * Brief info of the class IOCConifg.
 **/
@Configuration
@Import({PersonController.class, PersonService.class, PersonDao.class})
public class IOCConifg {

  @Bean
  @Primary
  public PersonService personService(){
    return new PersonService(2);
  }

}
