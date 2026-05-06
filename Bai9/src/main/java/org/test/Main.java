package org.test;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  // khởi tạo Logger
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public void processData(String dataName, int value) {
    // Thay System.out.println() ---> logger Mức INFO
    logger.info("Dữ liệu: {} giá trị: {}", dataName, value);

    try {
      if (value < 0) {
        throw new IllegalArgumentException("Giá trị không hợp lệ");
      }
      // Logic xử lý...
    } catch (Exception e) {
      // Xử lý ngoại lệ - Mức ERROR
      // Lưu ý: Luôn truyền exception làm tham số cuối cùng để in Stack Trace
      logger.error("Xảy ra lỗi khi xử lý {}: {}", dataName, e.getMessage());

    }
  }
}
