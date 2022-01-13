package com.dci.spring.examples.exercise2.samples;

import javax.annotation.PostConstruct;

public class ComponentWithDependencies {

  private ConstructorInjected constructorInjected;

  private SetterInjected setterInjected;

  private FieldInjected fieldInjected;

  @PostConstruct
  public void postConstruct() {
    System.out.println();
    System.out.println("============================");
    System.out.println(constructorInjected.text());
    System.out.println(setterInjected.text());
    System.out.println(fieldInjected.text());
    System.out.println("============================");
    System.out.println();
  }
}
