package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Calculator {
  private static final Logger logger = LoggerFactory.getLogger(Calculator.class);

  public int add(int a, int b) {
    logger.info("Sum of a and b: {} + {}", a, b);
    return a + b;
  }
}