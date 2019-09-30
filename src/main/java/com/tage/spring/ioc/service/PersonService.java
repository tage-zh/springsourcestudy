package com.tage.spring.ioc.service;

import com.tage.spring.ioc.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Brief info of the class PersonService.
 **/
@Service
//@Primary
public class PersonService {

  public PersonService() {
    a =1;
  }

  public PersonService(int a) {
    this.a = a;
  }

  private int a;

  @Autowired
  private PersonDao personDao;

  public void p(){
    System.out.println(a);
  }

}
