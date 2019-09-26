package com.tage.spring.config;

import com.tage.spring.controller.PersonController;
import com.tage.spring.dao.PersonDao;
import com.tage.spring.service.PersonService;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * IOCConifg Tester.
 *
 * @author zhao hu
 * @version 1.0
 * @since <pre>Sep 26, 2019</pre>
 */
public class IOCConifgTest {

  @Test
  public void test(){
    AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(IOCConifg.class);
    for (String beanDefinitionName : app.getBeanDefinitionNames()) {
      System.out.println(beanDefinitionName);
    }
    PersonController personController = app.getBean(PersonController.class);
    personController.getPersonService();
    PersonService personService = (PersonService) app.getBean(PersonService.class);
    personService.p();
//    System.out.println(app.getBean(PersonService.class));
//    System.out.println(app.getBean(PersonDao.class));
  }


} 
