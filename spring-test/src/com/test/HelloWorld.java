package com.test;

public class HelloWorld {
  private String message;
  private String date;

  public void setMessage(String message) {
    this.message = message;
  }

  public void getMessage() {
    System.out.println("Your Message: " + message);
  }

  public void setDate(String date) {
    this.date = date;
  }

  public void getDate() {
    System.out.println("Your Date: " + date);
  }

  
}
