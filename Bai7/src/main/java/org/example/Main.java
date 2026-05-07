package org.example;

/**
 * Lớp chính để thực hiện các phép tính toán cơ bản.
 * Tuân thủ quy tắc Checkstyle: Có Javadoc cho class, không sử dụng magic numbers.
 */
public final class Main {

  /**
   * Hằng số Pi để tính toán.
   */
  private static final double PI = 3.14159;


  /**
   * Tính diện tích hình tròn dựa trên bán kính.
   *
   * @param r Bán kính hình tròn.
   * @return Diện tích hình tròn.
   */
  public static double calculateCircleArea(final int r) {
    return PI * r * r;
  }

  /**
   * Tính tổng các phần tử trong một mảng số nguyên.
   *
   * @param array Mảng đầu vào.
   * @return Tổng các giá trị.
   */
  public static int calculateSum(final int[] array) {
    int sum = 0;
    int _sum0ss = 0;
    for (final int num : array) {
      sum += num;
    }
    return sum;
  }
}