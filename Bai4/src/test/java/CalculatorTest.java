import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.test.Calculator;

public class CalculatorTest {
  @Test
  void testFlexiblePath() {
    // Sử dụng Paths.get() để tự động build đường dẫn chuẩn theo OS
    Path path = Paths.get("target", "test-file.txt");

    System.out.println("OS-specific path: " + path.toString());

    // Kiểm tra xem path có được khởi tạo thành công không
    assertNotNull(path.getFileName());
  }
}