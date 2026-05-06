
import org.test.MathUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathUtilsTest {

    @BeforeAll
    public static void setUpAll() {
        System.out.println("=== Bắt đầu chạy MathUtilsTest ===");
    }

    @AfterAll
    public static void tearDownAll() {
        System.out.println("=== Kết thúc ===");
    }

    // --- TEST CASES CHO HÀM MAX ---

    @Test
    public void testMax_AGreaterThanB() {
        assertEquals(5, MathUtils.max(5, 2));
    }

    @Test
    public void testMax_AEqualsB() {
        assertEquals(3, MathUtils.max(3, 3));
    }

    @Test
    public void testMax_ALessThanB() {
        assertEquals(4, MathUtils.max(-1, 4));
    }

    @Test
    public void testMax_MaxValue() {
        assertEquals(Integer.MAX_VALUE, MathUtils.max(Integer.MAX_VALUE, 0));
    }

    @Test
    public void testMax_MinValue() {
        assertEquals(0, MathUtils.max(Integer.MIN_VALUE, 0));
    }

    @Test
    public void testMax_MaxAndMinValue() {
        assertEquals(Integer.MAX_VALUE, MathUtils.max(Integer.MAX_VALUE , 10));
    }

    // --- TEST CASES CHO HÀM DIVIDE ---

    @Test
    public void testDivide_PositiveDivider() {
        assertEquals(5, MathUtils.divide(10, 2));
    }

    @Test
    public void testDivide_NegativeDivider() {
        assertEquals(-5, MathUtils.divide(10, -2));
    }

    @Test
    public void testDivide_ZeroDivider() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            MathUtils.divide(10, 0);
        });
        assertEquals("Divider must not be zero", exception.getMessage());
    }
}