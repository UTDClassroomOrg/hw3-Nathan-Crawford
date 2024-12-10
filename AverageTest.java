import com.example.junitTest; // Import the class to be tested
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AverageTest {

    @Test
    public void testAverageNormalInputs() {
        int[] list = {10, 20, 30, 40};
        int k = 3;
        assertEquals(20, junitTest.average(k, list));
    }

    @Test
    public void testAverageKGreaterThanListLength() {
        int[] list = {5, 15, 25};
        int k = 5; // Larger than the array length
        assertEquals(15, junitTest.average(k, list));
    }

    @Test
    public void testAverageEmptyArray() {
        int[] list = {};
        int k = 3;
        assertEquals(0, junitTest.average(k, list));
    }

    @Test
    public void testAverageKIsZero() {
        int[] list = {10, 20, 30};
        int k = 0;
        assertEquals(0, junitTest.average(k, list));
    }

    @Test
    public void testAverageWithNegativeNumbers() {
        int[] list = {-10, -20, -30, -40};
        int k = 3;
        assertEquals(-20, junitTest.average(k, list));
    }

    @Test
    public void testAverageKEqualsListLength() {
        int[] list = {5, 10, 15};
        int k = 3;
        assertEquals(10, junitTest.average(k, list));
    }
}
