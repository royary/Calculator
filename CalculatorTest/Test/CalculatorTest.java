import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addTest() {
        Calculator c1 = new Calculator();
        assertEquals(11110, c1.add(10086, 1024));
    }

    @Test
    void minusTest() {
        Calculator c2 = new Calculator();
        assertEquals(9062, c2.minus(10086, 1024));
    }

    @Test
    void minusTest2() {
        Calculator c3 = new Calculator();
        assertEquals(1000, c3.minus(-1200, -2200));
    }
}


