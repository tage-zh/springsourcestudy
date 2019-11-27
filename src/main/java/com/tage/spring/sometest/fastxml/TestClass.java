package com.tage.spring.sometest.fastxml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

/**
 * Brief info of the class TestClass.
 **/
public class TestClass {

  public static void main(String[] args) throws JsonProcessingException {
    SimpleFilterProvider provider = new SimpleFilterProvider();
    provider.addFilter("stuFilter", SimpleBeanPropertyFilter.filterOutAllExcept("name"));
    ObjectMapper om = new ObjectMapper();
    om.setFilterProvider(provider);
    Student s = new Student("name","phone1111");
    System.out.println(om.writeValueAsString(s));
  }

}
