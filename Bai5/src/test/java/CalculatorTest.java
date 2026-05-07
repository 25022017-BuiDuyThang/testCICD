import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Calculator;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

  private final Calculator calculator = new Calculator();

  @Test
  void addShouldReturnSumForPositiveNumbers() {
    assertEquals(5, calculator.add(2, 3));
  }

  @Test
  void addShouldHandleZero() {
    assertEquals(0, calculator.add(0, 0));
  }

  @Test
  void addShouldHandleNegativeNumbers() {
    assertEquals(7, calculator.add(-2, 5));
  }
}