package com.dci.spring.examples.exercise2.samples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;

public class ComponentWithDependencies {

//  @Autowired will inject a ConstructorInjected instance here.
  @Autowired
  private ConstructorInjected constructorInjected;

//  @Autowired will inject a SetterInjected instance here.
  @Autowired
  private SetterInjected setterInjected;

//  @Autowired will inject a FieldInjected instance here.
  @Autowired
  private FieldInjected fieldInjected;

  public ComponentWithDependencies(ConstructorInjected constructorInjected) {
    this.constructorInjected = constructorInjected;
  }

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

  public void setSetterInjected(SetterInjected setterInjected) {
    this.setterInjected = setterInjected;
  }
}
