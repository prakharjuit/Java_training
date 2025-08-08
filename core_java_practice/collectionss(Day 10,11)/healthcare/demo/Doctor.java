package com.healthcare.demo;

public abstract class Doctor {
  protected String name;
  public Doctor(String name)
  {
	  this.name = name;
	  
  }
  public abstract void diagnose(Patient patient);
}
