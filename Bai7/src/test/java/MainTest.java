
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Lớp kiểm thử cho Main.
 */
public class MainTest {


  @Test
  void testCalculateCircleArea_ZeroRadius() {
    // Diện tích phải bằng 0 khi r = 0
    assertEquals(0.0, Main.calculateCircleArea(0), 0.001);
  }

  @Test
  void testCalculateCircleArea_PositiveRadius() {
    double expected = 3.14159 * 5 * 5;
    assertEquals(expected, Main.calculateCircleArea(5), 0.001);
  }

  // Test cho hàm tính tổng mảng

  @Test
  void testCalculateSum_EmptyArray() {
    int[] numbers = {};
    assertEquals(0, Main.calculateSum(numbers), "Tổng mảng rỗng phải bằng 0");
  }

  @Test
  void testCalculateSum_PositiveNumbers() {
    int[] numbers = {1, 2, 3, 4, 5};
    assertEquals(15, Main.calculateSum(numbers), "1+2+3+4+5 phải bằng 15");
  }

  @Test
  void testCalculateSum_NegativeNumbers() {
    int[] numbers = {-1, -2, 5};
    assertEquals(3, Main.calculateSum(numbers), "-1 + -2 + 5 phải bằng 2");
  } // giả sử test fail để test
}