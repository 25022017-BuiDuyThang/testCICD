package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShippingCalculatorTest {

  ShippingCalculator calc = new ShippingCalculator();

  @Test
  void testStandard() {
    assertEquals(15000.0, calc.calculate(5, "STANDARD"));
  }

  @Test
  void testExpress() {
    assertEquals(45000.0, calc.calculate(5, "EXPRESS"));
  }
//  @Test
//  void testError(){assertEquals(45000.0, calc.calculate(5, "UNKNOWN"));}
  @Test
  void testInvalidWeight() {
    assertThrows(IllegalArgumentException.class,
        () -> calc.calculate(-1, null));
  }
  @Test
  void testInvalidWeight1() {
    assertThrows(IllegalArgumentException.class,
        () -> calc.calculate(99, null));
  }
}
