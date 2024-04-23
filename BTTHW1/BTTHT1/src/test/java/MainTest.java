import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testPositiveNumber() {
        int n = 10;
        int expectedSum = 55;
        int actualSum = calculateSum(n);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testZero() {
        int n = 0;
        int expectedSum = 0;
        int actualSum = calculateSum(n);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testNegativeNumber() {
        int n = -5;
        int expectedSum = 0;
        int actualSum = calculateSum(n);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testLargeNumber() {
        int n = 1000;
        int expectedSum = 500500;
        int actualSum = calculateSum(n);
        assertEquals(expectedSum, actualSum);
    }

    private int calculateSum(int n) {
        if (n <= 0) {
            return 0;
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            return sum;
        }
    }
}
