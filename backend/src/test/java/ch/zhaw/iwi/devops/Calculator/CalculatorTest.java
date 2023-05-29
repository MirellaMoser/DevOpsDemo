package ch.zhaw.iwi.devops.Calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
        // add more test cases
    }
    
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.subtract(0, 0));
    }
    
    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.multiply(0, 5));
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(-15, calculator.multiply(3, -5));
    }

    @Test
    public void testDivide2() {
        Calculator calculator = new Calculator();
        assertEquals(0, calculator.divide(0, 5));
        assertEquals(1, calculator.divide(3, 3));
        assertEquals(-3, calculator.divide(15, -5));
    }   
}
