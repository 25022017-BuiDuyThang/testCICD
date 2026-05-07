import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import org.junit.jupiter.api.Test;

public class DirectionTest {
  @Test
  void testPathSeparator() {
    String expectedPath = "target\\test-file.txt"; // Hardcoded kiểu Windows
    File file = new File("target", "test-file.txt");

    // So sánh đường dẫn thực tế của hệ thống với chuỗi hardcoded
    // Trên Ubuntu, file.getPath() sẽ trả về "target/test-file.txt"
    // => So sánh này sẽ FAIL trên Ubuntu/macOS
    assertEquals(expectedPath, file.getPath(), "Đường dẫn không khớp với định dạng Windows!");
  }
}