package com.tage.spring.sometest.fastxml;

import com.fasterxml.jackson.annotation.JsonFilter;

/**
 * Brief info of the class Student.
 **/
@JsonFilter("stuFilter")
public class Student {

  private String name;
  private String phone;

  public Student(String name, String phone) {
    this.name = name;
    this.phone = phone;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
}
