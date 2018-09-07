package com.test;

import java.io.File;
import java.net.URL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class MainApp {
  
  public static void main(String[] args) {
    Logger.configureL4J();
    
    System.out.println(">>> from MainApp.main()");

    System.out.println(System.getProperty("java.class.path"));    
    System.out.println(new File(".").getAbsoluteFile());
    
    File f = new File("bin/config/beans-test.xml");
    System.out.println("Exist test: " + f.exists());

    
    @SuppressWarnings("resource")
    ApplicationContext context = new ClassPathXmlApplicationContext("file:bin/config/beans-test.xml");
    
    HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
    obj.getMessage();
    obj.getDate();

    BeanTest bt = (BeanTest) context.getBean("beanTest");
    System.out.println(bt.getName());
    System.out.println(bt.getId());

    BeanTestExt bte = (BeanTestExt) context.getBean("beanTestExt");
    System.out.println(bte.getName());
    System.out.println(bte.getSurname());
    System.out.println(bte.getId());
  
  }

}
