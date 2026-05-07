package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public int add(int a, int b) {
    logger.info("Sum of a and b: {} + {}", a, b);
    return a + b;
  }
}