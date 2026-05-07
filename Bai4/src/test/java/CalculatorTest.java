import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.test.Calculator;

public class CalculatorTest {
  @Test
  void testHardcodedPath() {
    // Cố tình dùng format của Windows: folder\file.txt
    String path = "target" + "\\" + "test-file.txt";
    File file = new File(path);

    System.out.println("Checking path: " + path);

    // Bài test này sẽ chạy đúng trên Windows
    // Nhưng sẽ tạo ra kết quả sai lệch hoặc lỗi logic trên Linux/macOS
    assertTrue(path.contains("\\"));
  }
}