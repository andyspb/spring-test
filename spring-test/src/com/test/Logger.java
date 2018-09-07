package com.test;

import org.apache.log4j.varia.NullAppender;

public class Logger {
  public static void configureL4J() {
//  org.apache.log4j.BasicConfigurator.configure();
  org.apache.log4j.BasicConfigurator.configure(new NullAppender());

}

}
