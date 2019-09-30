package com.tage.spring.ioc.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * Brief info of the class Bird.
 **/

@Data
public class Bird {
  @Value("${bird.name}")
  private String name;
  @Value("1")
  private Integer age;
}
