import org.test.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculatorTest {
  @Test
  public void testAdd1() {
    Calculator calc = new Calculator();
    assertEquals(5, calc.add(2, 3), "2 + 3 = 5");
  }
  @Test
  public void testAdd2(){
    Calculator calculator = new Calculator();
    assertEquals(10, calculator.add(5,5), "5 + 5 = 10");
  }
  @Test
  public void testAdd3(){
    Calculator calculator = new Calculator();
    assertEquals(10, calculator.add(5,5), "5 + 5 = 10");
  }
  @Test
  public void testDivide(){
    Calculator calculator = new Calculator();
    assertEquals(10, calculator.divide(10,0), "Khong the chia");
  }
}