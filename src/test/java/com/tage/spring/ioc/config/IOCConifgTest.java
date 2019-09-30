package com.tage.spring.ioc.config;

import com.tage.spring.ioc.controller.PersonController;
import com.tage.spring.ioc.service.PersonService;
import org.junit.Test;
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
    PersonService personService = (PersonService) app.getBean("personService");
    personService.p();
//    System.out.println(app.getBean(PersonService.class));
//    System.out.println(app.getBean(PersonDao.class));
  }


} 
