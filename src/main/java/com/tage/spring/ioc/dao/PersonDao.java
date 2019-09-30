package com.tage.spring.ioc.dao;

import com.tage.spring.ioc.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Brief info of the class PersonDao.
 **/
@Repository
public class PersonDao {

  @Autowired
  private PersonService personService;

}
