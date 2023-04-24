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
        assertEquals(2, calculator.subtract(5, 3));
        // add more test cases
    }
    
    // incomplete test cases for multiply and divide methods
    @Test
    public void testMultiply() {
        // TODO: write test cases
    }
    
    @Test
    public void testDivide() {
        // TODO: write test cases
    }
}