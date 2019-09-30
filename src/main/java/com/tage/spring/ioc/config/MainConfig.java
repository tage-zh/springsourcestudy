package com.tage.spring.ioc.config;

import com.tage.spring.ioc.beans.Person;
import com.tage.spring.ioc.condition.LinuxCondition;
import com.tage.spring.ioc.condition.WindowsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Brief info of the class MainConfig.
 **/
@Configuration
@Import({TageImportSelector.class,TageImportBeandefination.class})
//@ComponentScan(basePackages = {"com.tage.spring"}, useDefaultFilters = false, excludeFilters = {
//    @Filter(type = FilterType.ANNOTATION, value = Controller.class)
//})
public class MainConfig {
  @Bean
  public TageFactoryBean tageFactoryBean(){
    return new TageFactoryBean();
  }

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
