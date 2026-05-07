package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Direction {
  private static final Logger logger = LoggerFactory.getLogger(Direction.class);

  public int add(int a, int b) {
    logger.info("Sum: {} + {}", a, b);
    return a + b + b + a;
  }
}