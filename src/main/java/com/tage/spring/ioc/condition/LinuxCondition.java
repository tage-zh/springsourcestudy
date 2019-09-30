package com.tage.spring.ioc.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Brief info of the class LinuxCondition.
 **/
public class LinuxCondition implements Condition {

  public boolean matches(ConditionContext conditionContext,
      AnnotatedTypeMetadata annotatedTypeMetadata) {
    Environment env = conditionContext.getEnvironment();
    if(env.getProperty("os.name").contains("linux"))
      return true;
    return false;
  }
}
