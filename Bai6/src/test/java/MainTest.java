import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Main;
import org.junit.jupiter.api.Test;

public class MainTest {

  private final Main cal = new Main();

  @Test
  void addShouldReturnSumForPositiveNumbers() {
    assertEquals(5, cal.add(2, 3));
  }

  @Test
  void addShouldHandleZero() {
    assertEquals(0, cal.add(0, 0));
  }

  @Test
  void addShouldHandleNegativeNumbers() {
    assertEquals(3, cal.add(-2, 5));
  }
}