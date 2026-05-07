import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.test.Calculator;

public class CalculatorTest {
  @Test
  void testPathSeparator() {
    String expectedPath = "target\\test-file.txt"; // Hardcoded kiểu Windows
    File file = new File("target", "test-file.txt");

    // So sánh đường dẫn thực tế của hệ thống với chuỗi hardcoded
    // Trên Ubuntu, file.getPath() sẽ trả về "target/test-file.txt"
    // => So sánh này chắc chắn sẽ FAIL trên Ubuntu/macOS
    assertEquals(expectedPath, file.getPath(), "Đường dẫn không khớp với định dạng Windows!");
  }
}