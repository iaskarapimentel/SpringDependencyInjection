package com.dci.spring.examples.exercise2.samples;

public class ConstructorClass implements ConstructorInjected {

  @Override
  public String text() {
    return "I was injected in the constructor!";
  }
}
