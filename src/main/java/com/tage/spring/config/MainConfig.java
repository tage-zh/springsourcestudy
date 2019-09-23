package com.tage.spring.config;

import com.tage.spring.beans.Person;
import com.tage.spring.condition.LinuxCondition;
import com.tage.spring.condition.WindowsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * Brief info of the class MainConfig.
 **/
@Configuration
//@ComponentScan(basePackages = {"com.tage.spring"}, useDefaultFilters = false, excludeFilters = {
//    @Filter(type = FilterType.ANNOTATION, value = Controller.class)
//})
public class MainConfig {

  @Bean
//  @Lazy
//  @Scope("prototype")
  public Person person() {
    System.out.println("init person");
    Person person = new Person();
    person.setAge(22);
    person.setName("tage");
    return person;
  }

  @Bean
  @Conditional(WindowsCondition.class)
  public Person personWindows(){
    System.out.println("init personWindows");
    Person person = new Person();
    person.setAge(22);
    person.setName("tage");
    return person;
  }

  @Bean
  @Conditional(LinuxCondition.class)
  public Person personLinux(){
    System.out.println("init personLinux");
    Person person = new Person();
    person.setAge(22);
    person.setName("tage");
    return person;
  }

}
