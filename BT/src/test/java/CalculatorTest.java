import com.week1.project.Calculator;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    private void assertEquals(int i, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
    }

    @Test
    public void testSubtract() {
        assertEquals(1, calculator.subtract(4, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(12, calculator.multiply(3, 4));
    }

    @Test
    public void testDivide() {
        assertEquals(5, calculator.divide(10, 2));
    }
}
