/**
 * Ngoại lệ chung trong hệ thống ngân hàng.
 */
public class BankException extends Exception {
  @SuppressWarnings("checkstyle:MissingJavadocMethod")
  public BankException(String message) {
    super(message);
  }
}
