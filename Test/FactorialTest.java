import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    @DisplayName("number = 5")
    void factorial() {
        int number = 5;
        int expected = 120;
        int result = Factorial.factorial(number);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("number = 0")
    void testFactorial() {
        int number = 0;
        int expected = 1;
        int result = Factorial.factorial(number);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("number = -2")
    void testFactorial1() {
        int number = -2;
        int expected = -1;
        int result = Factorial.factorial(number);
        assertEquals(expected, result);
    }
}