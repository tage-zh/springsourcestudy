package com.tage.spring.ioc.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Brief info of the class TageImportSelector.
 **/
public class TageImportSelector implements ImportSelector {

  public String[] selectImports(AnnotationMetadata annotationMetadata) {
    String [] result = new String[2];
    result[0] = "com.tage.spring.ioc.beans.Cat";
    result[1] = "com.tage.spring.ioc.beans.Bird";
    return  result;
  }
}
