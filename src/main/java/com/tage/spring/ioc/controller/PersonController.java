package com.tage.spring.ioc.controller;

import com.tage.spring.ioc.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Brief info of the class PersonController.
 **/
@Controller
public class PersonController {


  @Autowired
//  @Qualifier("personService")
  private PersonService persddonService;

  public void getPersonService(){
    persddonService.p();
  }

}
