package com.tage.spring.config;

import com.tage.spring.controller.PersonController;
import com.tage.spring.dao.PersonDao;
import com.tage.spring.service.PersonService;
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
//  @Primary
  public PersonService personService(){
    return new PersonService(2);
  }

}
