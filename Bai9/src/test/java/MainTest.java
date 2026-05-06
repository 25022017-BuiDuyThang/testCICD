
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.test.Main;
import org.junit.jupiter.api.Test;

public class MainTest {
  private final Main main = new Main();
  @Test
  public void Test1(){
    assertDoesNotThrow(() -> main.processData("Data1" , 100));
  }
  @Test
  public void Test2(){
    assertDoesNotThrow(() -> main.processData("Data2", -22));
  }
}