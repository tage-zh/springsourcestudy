package com.tage.spring.controller;

import com.tage.spring.service.PersonService;
import javax.annotation.Resource;
import javax.annotation.Resources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Brief info of the class PersonController.
 **/
@Controller
public class PersonController {


  @Resource
//  @Qualifier("personService")
  private PersonService personService;

  public void getPersonService(){
    personService.p();
  }

}
