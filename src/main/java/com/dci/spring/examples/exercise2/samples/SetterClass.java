package com.dci.spring.examples.exercise2.samples;

public class SetterClass implements SetterInjected{

  @Override
  public String text() {
    return "I was injected in the field!";
  }
}
