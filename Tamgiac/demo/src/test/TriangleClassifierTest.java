import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TriangleClassifierTest {

    @Test
    public void testEquilateralTriangle() {
        assertEquals("Equilateral", TriangleClassifier.classifyTriangle(5, 5, 5));
    }

    @Test
    public void testIsoscelesTriangle() {
        assertEquals("Isosceles", TriangleClassifier.classifyTriangle(5, 5, 6));
    }

    @Test
    public void testScaleneTriangle() {
        assertEquals("Scalene", TriangleClassifier.classifyTriangle(3, 4, 5));
    }

    @Test
    public void testNotATriangle() {
        assertEquals("NotATriangle", TriangleClassifier.classifyTriangle(1, 2, 3));
    }

    @Test
    public void testRightTriangle() {
        assertEquals("RightTriangle", TriangleClassifier.classifyTriangle(3, 4, 5));
    }
}
